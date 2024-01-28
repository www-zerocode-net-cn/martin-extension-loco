package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Apimanager;
import cn.net.zerocode.loco.mapper.ApimanagerMapper;
import cn.net.zerocode.loco.service.ApimanagerService;
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
public class ApimanagerServiceImpl extends MartinServiceImpl<ApimanagerMapper, Apimanager> implements ApimanagerService {
    @Override
    protected void setEntity() {
        this.clz = Apimanager.class;
    }
}
