package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.Apimanager;
import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.service.ApimanagerService;
import com.java2e.martin.common.core.api.R;
import com.java2e.martin.common.log.annotation.MartinLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.HashMap;
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
@Api(value = "apimanager", description = "the apimanager API")
@RestController
@RequestMapping(value = "")
public class ApimanagerController implements ApimanagerApi {

    @Autowired
    private ApimanagerService apimanagerService;

    @ApiOperation(value = "接口数据管理", nickname = "create", notes = "新增", tags = {"apimanager",})
    @RequestMapping(value = "/apimanager",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Apimanager apimanager) {
        return R.ok(apimanagerService.save(apimanager));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(apimanagerService.removeById(id));
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<String> schema, @Valid Optional<String> typed, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return R.ok(apimanagerService.getPage(new HashMap()));
    }

    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete apimanager) {
        return R.ok(apimanagerService.removeByIds(apimanager.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Apimanager apimanager) {
        return R.ok(apimanagerService.updateById(apimanager));
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(apimanagerService.getById(id));
    }

    @MartinLog("获取核心模型树")
    @Override
    public R tree(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<String> schema, @Valid Optional<String> typed, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return R.ok(new HashMap<>());
    }

    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Apimanager apimanager) {
        apimanager.setId(id);
        return R.ok(apimanagerService.updateById(apimanager));
    }


}

