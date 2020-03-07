package sh.budao.sc.common.log.aspect;

import budao.sh.sc.common.util.SpringContextHolder;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import sh.budao.sc.common.log.annotation.SysLog;
import sh.budao.sc.common.log.event.SysLogEvent;
import sh.budao.sc.common.log.util.SysLogUtils;

@Aspect
@Slf4j
public class SysLogAspect {
    @Around("@annotation(sysLog)")
    @SneakyThrows
    public Object around(ProceedingJoinPoint point, SysLog sysLog) {
        String strClassName = point.getTarget().getClass().getName();
        String strMethodName = point.getSignature().getName();
        log.debug("[类名]:{},[方法]:{}", strClassName, strMethodName);

        sh.budao.sc.services.admin.api.entity.SysLog logVo = SysLogUtils.getSysLog();
        logVo.setTitle(sysLog.value());
        // 发送异步日志事件
        Long startTime = System.currentTimeMillis();
        Object obj = point.proceed();
        Long endTime = System.currentTimeMillis();
        logVo.setTime(endTime - startTime);
        SpringContextHolder.publishEvent(new SysLogEvent(logVo));
        return obj;
    }

}
