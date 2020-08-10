package io.tosimple.demo.common.security.component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.tosimple.demo.common.core.constant.CommonConstants;
import io.tosimple.demo.common.security.exception.PigxAuth2Exception;
import lombok.SneakyThrows;

/**
 * @author 
 * @date 2018/11/16
 * <p>
 * OAuth2 异常格式化
 */
public class PigxAuth2ExceptionSerializer extends StdSerializer<PigxAuth2Exception> {

	public PigxAuth2ExceptionSerializer() {
		super(PigxAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(PigxAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}

}
