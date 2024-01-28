package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.Lowdatatyped;
import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.service.LowdatatypedService;
import com.java2e.martin.common.core.api.R;
import com.java2e.martin.common.log.annotation.MartinLog;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Optional;


/**
 * <p>
 * 数据类型 路由
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
public class LowdatatypedController implements LowdatatypedApi {

    @Autowired
    private LowdatatypedService lowdatatypedService;

    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Lowdatatyped lowdatatyped) {
        return R.ok(lowdatatypedService.save(lowdatatyped));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(lowdatatypedService.removeById(id));
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<String> schema, @Valid Optional<String> typed, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return R.ok(lowdatatypedService.getPage(new HashMap()));
    }

    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete lowdatatyped) {
        return R.ok(lowdatatypedService.removeByIds(lowdatatyped.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Lowdatatyped lowdatatyped) {
        return R.ok(lowdatatypedService.updateById(lowdatatyped));
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(lowdatatypedService.getById(id));
    }

    @MartinLog("treeRead")
    @Override
    public R treeRead(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<String> typed, @Valid Optional<String> pid, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }

    @MartinLog("treeRead")
    @Override
    public R treev2(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<String> typed, @Valid Optional<String> pid, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }


    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Lowdatatyped lowdatatyped) {
        lowdatatyped.setId(id);
        return R.ok(lowdatatypedService.updateById(lowdatatyped));
    }


}

