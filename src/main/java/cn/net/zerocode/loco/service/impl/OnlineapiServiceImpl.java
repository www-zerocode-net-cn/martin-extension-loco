package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Onlineapi;
import cn.net.zerocode.loco.mapper.OnlineapiMapper;
import cn.net.zerocode.loco.service.OnlineapiService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 核心模型 服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class OnlineapiServiceImpl extends MartinServiceImpl<OnlineapiMapper, Onlineapi> implements OnlineapiService {
    @Override
    protected void setEntity() {
        this.clz = Onlineapi.class;
    }
}
