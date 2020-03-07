package sh.budao.sc.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.HttpStatus;
import sh.budao.sc.common.security.component.Auth2ExceptionSerializer;

/**
 * @author sc
 * @date 2020/3/8
 */
@JsonSerialize(using = Auth2ExceptionSerializer.class)
public class UnauthorizedException extends Auth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
