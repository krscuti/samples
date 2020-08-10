package io.tosimple.demo.admin.mapper;

import com.pig4cloud.pigx.admin.api.entity.SysDept;
import com.pig4cloud.pigx.common.data.datascope.DataScopeMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 部门管理 Mapper 接口
 * </p>
 *
 * @author
 * @since 2018-01-20
 */
@Mapper
public interface SysDeptMapper extends DataScopeMapper<SysDept> {

}
