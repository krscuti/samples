package io.tosimple.demo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.tosimple.demo.admin.api.entity.SysPublicParam;
import io.tosimple.demo.common.core.util.R;

/**
 * 公共参数配置
 *
 * @author
 * @date 2019-04-29
 */
public interface SysPublicParamService extends IService<SysPublicParam> {

	/**
	 * 通过key查询公共参数指定值
	 * @param publicKey
	 * @return
	 */
	String getSysPublicParamKeyToValue(String publicKey);

	/**
	 * 更新参数
	 * @param sysPublicParam
	 * @return
	 */
	R updateParam(SysPublicParam sysPublicParam);

	/**
	 * 删除参数
	 * @param publicId
	 * @return
	 */
	R removeParam(Long publicId);

}
