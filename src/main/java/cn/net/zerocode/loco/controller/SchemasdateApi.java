/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.17).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.entity.Schemasdate;
import com.java2e.martin.common.core.api.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-22T20:40:48.565+08:00")

@Api(value = "schemadata", description = "the schemadata API")
@RequestMapping(value = "")
public interface SchemasdateApi {

    @ApiOperation(value = "list:查询", nickname = "create", notes = "新增", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata", method = RequestMethod.POST)
    R create(@ApiParam(value = "", required = true) @Valid @RequestBody Schemasdate data);


    @ApiOperation(value = "list:查询", nickname = "delete", notes = "删除", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata/{id}", method = RequestMethod.DELETE)
    R delete(@ApiParam(value = "A unique integer value identifying this 模板.", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "list:查询", nickname = "getMenuSchema", notes = "/id/ 根据ID获取菜单的模板数据", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata/{id}/getMenuSchema", method = RequestMethod.GET)
    R getMenuSchema(@ApiParam(value = "A unique integer value identifying this 模板.", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "list:查询", nickname = "list", notes = "查询", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata", method = RequestMethod.GET)
    R list(@ApiParam(value = "") @Valid @RequestParam(value = "description", required = false) Optional<String> description, @ApiParam(value = "") @Valid @RequestParam(value = "creator", required = false) Optional<String> creator, @ApiParam(value = "") @Valid @RequestParam(value = "modifier", required = false) Optional<String> modifier, @ApiParam(value = "") @Valid @RequestParam(value = "dept_belong_id", required = false) Optional<String> deptBelongId, @ApiParam(value = "") @Valid @RequestParam(value = "update_datetime", required = false) Optional<String> updateDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "create_datetime", required = false) Optional<String> createDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "is_deleted", required = false) Optional<BigDecimal> isDeleted, @ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) Optional<String> name, @ApiParam(value = "") @Valid @RequestParam(value = "schema", required = false) Optional<String> schema, @ApiParam(value = "") @Valid @RequestParam(value = "menu_id", required = false) Optional<BigDecimal> menuId, @ApiParam(value = "") @Valid @RequestParam(value = "is_login", required = false) Optional<String> isLogin, @ApiParam(value = "") @Valid @RequestParam(value = "Typed", required = false) Optional<String> typed, @ApiParam(value = "A search term.") @Valid @RequestParam(value = "search", required = false) Optional<String> search, @ApiParam(value = "Which field to use when ordering the results.") @Valid @RequestParam(value = "ordering", required = false) Optional<String> ordering, @ApiParam(value = "A page number within the paginated result set.") @Valid @RequestParam(value = "page", required = false) Optional<Integer> page, @ApiParam(value = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) Optional<Integer> limit);


    @ApiOperation(value = "list:查询", nickname = "multipleDelete", notes = "", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata/multiple_delete", method = RequestMethod.DELETE)
    R multipleDelete(@ApiParam(value = "", required = true) @Valid @RequestBody MultiDelete data);


    @ApiOperation(value = "list:查询", nickname = "partialUpdate", notes = "", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata/{id}", method = RequestMethod.PATCH)
    R partialUpdate(@ApiParam(value = "A unique integer value identifying this 模板.", required = true) @PathVariable("id") Integer id, @ApiParam(value = "", required = true) @Valid @RequestBody Schemasdate data);


    @ApiOperation(value = "list:查询", nickname = "read", notes = "单例", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata/{id}", method = RequestMethod.GET)
    R read(@ApiParam(value = "A unique integer value identifying this 模板.", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "list:查询", nickname = "update", notes = "修改", tags = {"schemadata",})
    @RequestMapping(value = "/schemadata/{id}", method = RequestMethod.PUT)
    R update(@ApiParam(value = "A unique integer value identifying this 模板.", required = true) @PathVariable("id") Long id, @ApiParam(value = "", required = true) @Valid @RequestBody Schemasdate data);

}