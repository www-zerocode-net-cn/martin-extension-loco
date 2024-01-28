package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Datasource;
import cn.net.zerocode.loco.mapper.DatasourceMapper;
import cn.net.zerocode.loco.service.DatasourceService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据源管理 服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class DatasourceServiceImpl extends MartinServiceImpl<DatasourceMapper, Datasource> implements DatasourceService {
    @Override
    protected void setEntity() {
        this.clz = Datasource.class;
    }
}
