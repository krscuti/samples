package io.tosimple.demo.admin.api.feign;

import io.tosimple.demo.common.core.constant.SecurityConstants;
import io.tosimple.demo.common.core.constant.ServiceNameConstants;
import io.tosimple.demo.common.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author
 * @date 2020/5/12
 * <p>
 * 查询参数相关
 */
@FeignClient(contextId = "remoteParamService", value = ServiceNameConstants.UPMS_SERVICE)
public interface RemoteParamService {

	/**
	 * 通过key 查询参数配置
	 * @param key key
	 * @param from 声明成内部调用，避免MQ 等无法调用
	 * @return
	 */
	@GetMapping("/param/publicValue/{key}")
	R<String> getByKey(@PathVariable("key") String key, @RequestHeader(SecurityConstants.FROM) String from);

}
