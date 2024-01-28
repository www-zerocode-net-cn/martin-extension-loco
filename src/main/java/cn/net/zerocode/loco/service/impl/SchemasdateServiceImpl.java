package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Schemasdate;
import cn.net.zerocode.loco.mapper.SchemasdateMapper;
import cn.net.zerocode.loco.service.SchemasdateService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class SchemasdateServiceImpl extends MartinServiceImpl<SchemasdateMapper, Schemasdate> implements SchemasdateService {
    @Override
    protected void setEntity() {
        this.clz = Schemasdate.class;
    }
}
