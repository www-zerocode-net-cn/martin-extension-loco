package cn.net.zerocode.loco.service;

import cn.net.zerocode.loco.entity.Datasource;
import com.java2e.martin.common.data.mybatis.service.MartinService;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 数据源管理 服务类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Transactional(rollbackFor = Exception.class)
public interface DatasourceService extends MartinService<Datasource> {

}
