package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.Assets;
import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.service.AssetsService;
import com.java2e.martin.common.core.api.R;
import com.java2e.martin.common.log.annotation.MartinLog;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Optional;


/**
 * <p>
 * 物料数据 路由
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Slf4j
public class AssetsController implements AssetApi {

    @Autowired
    private AssetsService assetsService;

    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Assets assets) {
        return R.ok(assetsService.save(assets));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(assetsService.removeById(id));
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<String> schema, @Valid Optional<String> typed, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return R.ok(assetsService.getPage(new HashMap()));
    }

    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete assets) {
        return R.ok(assetsService.removeByIds(assets.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Assets assets) {
        return R.ok(assetsService.updateById(assets));
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(assetsService.getById(id));
    }


    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Assets assets) {
        assets.setId(id);
        return R.ok(assetsService.updateById(assets));
    }


}

