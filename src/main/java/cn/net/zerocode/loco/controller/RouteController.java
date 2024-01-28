package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.entity.Route;
import cn.net.zerocode.loco.service.RouteService;
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
 * 路由管理 路由
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
public class RouteController implements RouteApi {

    @Autowired
    private RouteService routeService;

    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Route route) {
        return R.ok(routeService.save(route));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(routeService.removeById(id));
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<BigDecimal> dataSource, @Valid Optional<String> datasource, @Valid Optional<String> typed, @Valid Optional<BigDecimal> methods, @Valid Optional<BigDecimal> sort, @Valid Optional<BigDecimal> status, @Valid Optional<String> cacheid, @Valid Optional<String> url, @Valid Optional<String> sql, @Valid Optional<String> parameter, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }


    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete route) {
        return R.ok(routeService.removeByIds(route.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Route route) {
        return R.ok(routeService.updateById(route));
    }

    @Override
    public R postapi(@Valid Route data) {
        return null;
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(routeService.getById(id));
    }


    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Route route) {
        route.setId(id);
        return R.ok(routeService.updateById(route));
    }


}

