package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.entity.Onlineapi;
import cn.net.zerocode.loco.service.OnlineapiService;
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
 * 核心模型 路由
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
public class OnlineapiController implements OnlineapiApi {

    @Autowired
    private OnlineapiService onlineapiService;

    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Onlineapi onlineapi) {
        return R.ok(onlineapiService.save(onlineapi));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(onlineapiService.removeById(id));
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<BigDecimal> dataSource, @Valid Optional<String> datasource, @Valid Optional<String> typed, @Valid Optional<BigDecimal> methods, @Valid Optional<BigDecimal> sort, @Valid Optional<BigDecimal> status, @Valid Optional<String> cacheid, @Valid Optional<String> url, @Valid Optional<String> sql, @Valid Optional<String> parameter, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }


    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete onlineapi) {
        return R.ok(onlineapiService.removeByIds(onlineapi.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Onlineapi onlineapi) {
        return R.ok(onlineapiService.updateById(onlineapi));
    }

    @Override
    public R postapi(@Valid Onlineapi data) {
        return null;
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(onlineapiService.getById(id));
    }


    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Onlineapi onlineapi) {
        onlineapi.setId(id);
        return R.ok(onlineapiService.updateById(onlineapi));
    }


}

