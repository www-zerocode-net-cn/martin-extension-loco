package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Assets;
import cn.net.zerocode.loco.mapper.AssetsMapper;
import cn.net.zerocode.loco.service.AssetsService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物料数据 服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class AssetsServiceImpl extends MartinServiceImpl<AssetsMapper, Assets> implements AssetsService {
    @Override
    protected void setEntity() {
        this.clz = Assets.class;
    }
}
