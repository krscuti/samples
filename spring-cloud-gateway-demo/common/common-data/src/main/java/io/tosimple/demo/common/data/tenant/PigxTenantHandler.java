package io.tosimple.demo.common.data.tenant;

import com.baomidou.mybatisplus.extension.plugins.tenant.TenantHandler;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.NullValue;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author
 * @date 2018-12-26
 * <p>
 * 租户维护处理器
 */
@Slf4j
public class PigxTenantHandler implements TenantHandler {

	@Autowired
	private PigxTenantConfigProperties properties;

	/**
	 * 获取租户值
	 * <p>
	 * TODO 校验租户状态
	 * @return 租户值
	 */
	@Override
	public Expression getTenantId(boolean where) {
		Integer tenantId = TenantContextHolder.getTenantId();
		log.debug("当前租户为 >> {}", tenantId);

		if (tenantId == null) {
			return new NullValue();
		}
		return new LongValue(tenantId);
	}

	/**
	 * 获取租户字段名
	 * @return 租户字段名
	 */
	@Override
	public String getTenantIdColumn() {
		return properties.getColumn();
	}

	/**
	 * 根据表名判断是否进行过滤
	 * @param tableName 表名
	 * @return 是否进行过滤
	 */
	@Override
	public boolean doTableFilter(String tableName) {
		Integer tenantId = TenantContextHolder.getTenantId();
		// 租户中ID 为空，查询全部，不进行过滤
		if (tenantId == null) {
			return Boolean.TRUE;
		}

		return !properties.getTables().contains(tableName);
	}

}
