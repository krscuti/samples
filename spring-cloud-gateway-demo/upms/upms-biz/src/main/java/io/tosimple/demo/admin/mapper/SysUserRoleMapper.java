package io.tosimple.demo.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.tosimple.demo.admin.api.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户角色表 Mapper 接口
 * </p>
 *
 * @author
 * @since 2017-10-29
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

	/**
	 * 根据用户Id删除该用户的角色关系
	 * @param userId 用户ID
	 * @return boolean
	 * @author
	 * @date 2017年12月7日 16:31:38
	 */
	Boolean deleteByUserId(@Param("userId") Integer userId);

}
