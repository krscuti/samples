package sh.budao.sc.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import sh.budao.sc.common.security.component.Auth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author sc
 * @date 2020/3/8
 */
@JsonSerialize(using = Auth2ExceptionSerializer.class)
public class ForbiddenException extends Auth2Exception {

	public ForbiddenException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "access_denied";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.FORBIDDEN.value();
	}

}

