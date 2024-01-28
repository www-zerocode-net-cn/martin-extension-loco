package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.entity.Schemasdate;
import cn.net.zerocode.loco.service.SchemasdateService;
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
 * 路由
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
public class SchemasdateController implements SchemasdateApi {

    @Autowired
    private SchemasdateService schemasdateService;

    @MartinLog("添加核心模型")
    @Override
    public R create(@Valid Schemasdate schemasdate) {
        return R.ok(schemasdateService.save(schemasdate));
    }

    @MartinLog("删除核心模型")
    @Override
    public R delete(Integer id) {
        return R.ok(schemasdateService.removeById(id));
    }

    @MartinLog("核心模型getMenuSchema")
    @Override
    public R getMenuSchema(Integer id) {
        return null;
    }

    @MartinLog("分页查询核心模型")
    @SneakyThrows
    @Override
    public R list(@Valid Optional<String> description, @Valid Optional<String> creator, @Valid Optional<String> modifier, @Valid Optional<String> deptBelongId, @Valid Optional<String> updateDatetime, @Valid Optional<String> createDatetime, @Valid Optional<BigDecimal> isDeleted, @Valid Optional<String> name, @Valid Optional<String> schema, @Valid Optional<BigDecimal> menuId, @Valid Optional<String> isLogin, @Valid Optional<String> typed, @Valid Optional<String> search, @Valid Optional<String> ordering, @Valid Optional<Integer> page, @Valid Optional<Integer> limit) {
        return null;
    }


    @MartinLog("批量删除核心模型")
    @Override
    public R multipleDelete(@Valid MultiDelete schemasdate) {
        return R.ok(schemasdateService.removeByIds(schemasdate.getKeys()));
    }

    @MartinLog("编辑核心模型")
    @Override
    public R partialUpdate(Integer id, @Valid Schemasdate schemasdate) {
        return R.ok(schemasdateService.updateById(schemasdate));
    }

    @MartinLog("获取单个核心模型")
    @Override
    public R read(Integer id) {
        return R.ok(schemasdateService.getById(id));
    }


    @MartinLog("编辑核心模型")
    @Override
    public R update(Long id, @Valid Schemasdate schemasdate) {
        schemasdate.setId(id);
        return R.ok(schemasdateService.updateById(schemasdate));
    }


}

