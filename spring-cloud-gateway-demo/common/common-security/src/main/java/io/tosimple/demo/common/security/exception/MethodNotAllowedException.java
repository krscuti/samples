package io.tosimple.demo.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.tosimple.demo.common.security.component.PigxAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author 
 * @date 2018/7/8
 */
@JsonSerialize(using = PigxAuth2ExceptionSerializer.class)
public class MethodNotAllowedException extends PigxAuth2Exception {

	public MethodNotAllowedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
