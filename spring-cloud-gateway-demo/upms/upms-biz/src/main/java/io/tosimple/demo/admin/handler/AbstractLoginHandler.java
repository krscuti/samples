package io.tosimple.demo.admin.handler;

import com.pig4cloud.pigx.admin.api.dto.UserInfo;

/**
 * @author lengleng
 * @date 2018/11/18
 */
public abstract class AbstractLoginHandler implements LoginHandler {

	/***
	 * 数据合法性校验
	 * @param loginStr 通过用户传入获取唯一标识
	 * @return 默认不校验
	 */
	@Override
	public Boolean check(String loginStr) {
		return true;
	}

	/**
	 * 处理方法
	 * @param loginStr 登录参数
	 * @return
	 */
	@Override
	public UserInfo handle(String loginStr) {
		if (!check(loginStr)) {
			return null;
		}

		String identify = identify(loginStr);
		return info(identify);
	}

}
