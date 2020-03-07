package sh.budao.sc.common.security.component;

import budao.sh.sc.common.constant.CommonConstants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import lombok.SneakyThrows;
import sh.budao.sc.common.security.exception.Auth2Exception;

/**
 * @author sc
 * @date 2020/3/8
 * <p>
 * OAuth2 异常格式化
 */
public class Auth2ExceptionSerializer extends StdSerializer<Auth2Exception> {
	public Auth2ExceptionSerializer() {
		super(Auth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(Auth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}
}
