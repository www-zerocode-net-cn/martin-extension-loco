package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.Block;
import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.service.BlockService;
import com.java2e.martin.common.core.api.R;
import com.java2e.martin.common.log.annotation.MartinLog;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Optional;


/**
 * <p>
 * 区块管理 路由
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Slf4j
@RestController
public class BlockController implements BlockApi {

    @Autowired
    private BlockService blockService;

    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Block block) {
        return R.ok(blockService.save(block));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(blockService.removeById(id));
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> nameIcontains, @Valid Optional<BigDecimal> id, @Valid Optional<String> blockTypeId, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }


    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete block) {
        return R.ok(blockService.removeByIds(block.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Block block) {
        return R.ok(blockService.updateById(block));
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(blockService.getById(id));
    }


    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Block block) {
        block.setId(id);
        return R.ok(blockService.updateById(block));
    }


}

