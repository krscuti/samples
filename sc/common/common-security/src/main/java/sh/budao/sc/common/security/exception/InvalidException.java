package sh.budao.sc.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import sh.budao.sc.common.security.component.Auth2ExceptionSerializer;

/**
 * @author sc
 * @date 2019/2/1
 */
@JsonSerialize(using = Auth2ExceptionSerializer.class)
public class InvalidException extends Auth2Exception {

	public InvalidException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "invalid_exception";
	}

	@Override
	public int getHttpErrorCode() {
		return 426;
	}

}
