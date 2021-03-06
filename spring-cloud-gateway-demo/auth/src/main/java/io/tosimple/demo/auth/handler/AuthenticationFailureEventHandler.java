package io.tosimple.demo.auth.handler;

import io.tosimple.demo.admin.api.entity.SysLog;
import io.tosimple.demo.admin.api.feign.RemoteLogService;
import io.tosimple.demo.common.core.constant.CommonConstants;
import io.tosimple.demo.common.core.constant.SecurityConstants;
import io.tosimple.demo.common.core.util.WebUtils;
import io.tosimple.demo.common.log.util.SysLogUtils;
import io.tosimple.demo.common.security.handler.AuthenticationFailureHandler;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 
 * @date 2018/10/8
 */
@Slf4j
@Component
@AllArgsConstructor
public class AuthenticationFailureEventHandler implements AuthenticationFailureHandler {

	private final RemoteLogService logService;

	/**
	 * 异步处理，登录失败方法
	 * <p>
	 * @param authenticationException 登录的authentication 对象
	 * @param authentication 登录的authenticationException 对象
	 * @param request 请求
	 * @param response 响应
	 */
	@Async
	@Override
	@SneakyThrows
	public void handle(AuthenticationException authenticationException, Authentication authentication,
			HttpServletRequest request, HttpServletResponse response) {
		String username = authentication.getName();
		SysLog sysLog = SysLogUtils.getSysLog(request, username);
		sysLog.setTitle(username + "用户登录");
		sysLog.setType(CommonConstants.STATUS_LOCK);
		sysLog.setParams(username);
		sysLog.setException(authenticationException.getLocalizedMessage());
		String header = request.getHeader(HttpHeaders.AUTHORIZATION);
		sysLog.setServiceId(WebUtils.extractClientId(header).orElse("N/A"));

		logService.saveLog(sysLog, SecurityConstants.FROM_IN);

		log.info("用户：{} 登录失败，异常：{}", username, authenticationException.getLocalizedMessage());
	}

}
