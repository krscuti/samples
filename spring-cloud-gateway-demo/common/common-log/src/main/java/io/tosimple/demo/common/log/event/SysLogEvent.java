package io.tosimple.demo.common.log.event;

import io.tosimple.demo.admin.api.entity.SysLog;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author  系统日志事件
 */
@Getter
@AllArgsConstructor
public class SysLogEvent {

	private final SysLog sysLog;

}
