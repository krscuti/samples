package io.tosimple.demo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pig4cloud.pigx.admin.api.entity.SysRole;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2017-10-29
 */
public interface SysRoleService extends IService<SysRole> {

	/**
	 * 通过用户ID，查询角色信息
	 * @param userId
	 * @return
	 */
	List<SysRole> findRolesByUserId(Integer userId);

	/**
	 * 通过角色ID，删除角色
	 * @param id
	 * @return
	 */
	Boolean removeRoleById(Integer id);

}
