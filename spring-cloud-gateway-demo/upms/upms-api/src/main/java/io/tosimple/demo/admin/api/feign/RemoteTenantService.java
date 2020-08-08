package io.tosimple.demo.admin.api.feign;

import io.tosimple.demo.admin.api.entity.SysTenant;
import io.tosimple.demo.common.core.constant.SecurityConstants;
import io.tosimple.demo.common.core.constant.ServiceNameConstants;
import io.tosimple.demo.common.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

/**
 * @author 
 * @date 2019/6/19
 * <p>
 * 租户接口
 */
@FeignClient(contextId = "remoteTenantService", value = ServiceNameConstants.UPMS_SERVICE)
public interface RemoteTenantService {
	/**
	 * 查询全部有效租户
	 *
	 * @param from 内部标志
	 * @return
	 */
	@GetMapping("/tenant/list")
	R<List<SysTenant>> list(@RequestHeader(SecurityConstants.FROM) String from);

}
