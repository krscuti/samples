package io.tosimple.demo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.tosimple.demo.admin.api.entity.SysUserRole;

/**
 * <p>
 * 用户角色表 服务类
 * </p>
 *
 * @author
 * @since 2017-10-29
 */
public interface SysUserRoleService extends IService<SysUserRole> {

	/**
	 * 根据用户Id删除该用户的角色关系
	 * @param userId 用户ID
	 * @return boolean
	 * @author
	 * @date 2017年12月7日 16:31:38
	 */
	Boolean deleteByUserId(Integer userId);

}
