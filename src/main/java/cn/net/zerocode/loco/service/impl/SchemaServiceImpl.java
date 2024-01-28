package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Schema;
import cn.net.zerocode.loco.mapper.SchemaMapper;
import cn.net.zerocode.loco.service.SchemaService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 模板 服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class SchemaServiceImpl extends MartinServiceImpl<SchemaMapper, Schema> implements SchemaService {
    @Override
    protected void setEntity() {
        this.clz = Schema.class;
    }
}
