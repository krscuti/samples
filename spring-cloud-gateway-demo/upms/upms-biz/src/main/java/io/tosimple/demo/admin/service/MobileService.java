package io.tosimple.demo.admin.service;

import com.pig4cloud.pigx.common.core.util.R;

/**
 * @author
 * @date 2018/11/14
 */
public interface MobileService {

	/**
	 * 发送手机验证码
	 * @param mobile mobile
	 * @return code
	 */
	R<Boolean> sendSmsCode(String mobile);

}
