package io.tosimple.demo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pig4cloud.pigx.admin.api.dto.UserInfo;
import com.pig4cloud.pigx.admin.api.entity.SysSocialDetails;

/**
 * 系统社交登录账号表
 *
 * @author lengleng
 * @date 2018-08-16 21:30:41
 */
public interface SysSocialDetailsService extends IService<SysSocialDetails> {

	/**
	 * 绑定社交账号
	 * @param state 类型
	 * @param code code
	 * @return
	 */
	Boolean bindSocial(String state, String code);

	/**
	 * 根据入参查询用户信息
	 * @param inStr
	 * @return
	 */
	UserInfo getUserInfo(String inStr);

}
