package io.tosimple.demo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pig4cloud.pigx.admin.api.entity.SysLog;
import com.pig4cloud.pigx.admin.api.vo.PreLogVO;

import java.util.List;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author
 * @since 2017-11-20
 */
public interface SysLogService extends IService<SysLog> {

	/**
	 * 批量插入前端错误日志
	 * @param preLogVoList 日志信息
	 * @return true/false
	 */
	Boolean saveBatchLogs(List<PreLogVO> preLogVoList);

}
