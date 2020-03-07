package sh.budao.sc.common.log.event;

import org.springframework.context.ApplicationEvent;
import sh.budao.sc.services.admin.api.entity.SysLog;

/**
 * @author sc
 * 系统日志事件
 */
public class SysLogEvent extends ApplicationEvent {

	public SysLogEvent(SysLog source) {
		super(source);
	}
}
