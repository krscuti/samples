package io.tosimple.demo.common.data.tenant;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.tosimple.demo.common.core.constant.CommonConstants;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lengleng
 * @date 2018/9/14
 */
@Slf4j
public class PigxFeignTenantInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate requestTemplate) {
		if (TenantContextHolder.getTenantId() == null) {
			log.debug("TTL 中的 租户ID为空，feign拦截器 >> 跳过");
			return;
		}
		requestTemplate.header(CommonConstants.TENANT_ID, TenantContextHolder.getTenantId().toString());
	}

}
