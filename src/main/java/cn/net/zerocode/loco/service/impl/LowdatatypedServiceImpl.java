package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Lowdatatyped;
import cn.net.zerocode.loco.mapper.LowdatatypedMapper;
import cn.net.zerocode.loco.service.LowdatatypedService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据类型 服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class LowdatatypedServiceImpl extends MartinServiceImpl<LowdatatypedMapper, Lowdatatyped> implements LowdatatypedService {
    @Override
    protected void setEntity() {
        this.clz = Lowdatatyped.class;
    }
}
