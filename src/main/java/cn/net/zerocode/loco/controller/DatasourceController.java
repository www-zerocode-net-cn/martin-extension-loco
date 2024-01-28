package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.Datasource;
import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.service.DatasourceService;
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
 * 数据源管理 路由
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
public class DatasourceController implements DatasourceApi {

    @Autowired
    private DatasourceService datasourceService;

    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Datasource datasource) {
        return R.ok(datasourceService.save(datasource));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(datasourceService.removeById(id));
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<BigDecimal> datatype, @Valid Optional<String> database, @Valid Optional<String> user, @Valid Optional<BigDecimal> status, @Valid Optional<String> passwod, @Valid Optional<String> key, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }


    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete datasource) {
        return R.ok(datasourceService.removeByIds(datasource.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Datasource datasource) {
        return R.ok(datasourceService.updateById(datasource));
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(datasourceService.getById(id));
    }

    @Override
    public R treeRead(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<BigDecimal> datatype, @Valid Optional<String> database, @Valid Optional<String> user, @Valid Optional<BigDecimal> status, @Valid Optional<String> passwod, @Valid Optional<String> key, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }


    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Datasource datasource) {
        datasource.setId(id);
        return R.ok(datasourceService.updateById(datasource));
    }


}

