package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Block;
import cn.net.zerocode.loco.mapper.BlockMapper;
import cn.net.zerocode.loco.service.BlockService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 区块管理 服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class BlockServiceImpl extends MartinServiceImpl<BlockMapper, Block> implements BlockService {
    @Override
    protected void setEntity() {
        this.clz = Block.class;
    }
}
