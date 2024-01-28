/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.17).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.Lowdatatyped;
import cn.net.zerocode.loco.entity.MultiDelete;
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

@Api(value = "datatype", description = "the datatype API")
@RequestMapping(value = "")
public interface LowdatatypedApi {

    @ApiOperation(value = "数据类型管理", nickname = "create", notes = "新增", tags = {"datatype",})
    @RequestMapping(value = "/datatype", method = RequestMethod.POST)
    R create(@ApiParam(value = "", required = true) @Valid @RequestBody Lowdatatyped data);


    @ApiOperation(value = "数据类型管理", nickname = "delete", notes = "删除", tags = {"datatype",})
    @RequestMapping(value = "/datatype/{id}", method = RequestMethod.DELETE)
    R delete(@ApiParam(value = "A unique integer value identifying this 数据类型.", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "数据类型管理", nickname = "list", notes = "查询", tags = {"datatype",})
    @RequestMapping(value = "/datatype", method = RequestMethod.GET)
    R list(@ApiParam(value = "") @Valid @RequestParam(value = "description", required = false) Optional<String> description, @ApiParam(value = "") @Valid @RequestParam(value = "creator", required = false) Optional<String> creator, @ApiParam(value = "") @Valid @RequestParam(value = "modifier", required = false) Optional<String> modifier, @ApiParam(value = "") @Valid @RequestParam(value = "dept_belong_id", required = false) Optional<String> deptBelongId, @ApiParam(value = "") @Valid @RequestParam(value = "update_datetime", required = false) Optional<String> updateDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "create_datetime", required = false) Optional<String> createDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "is_deleted", required = false) Optional<BigDecimal> isDeleted, @ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) Optional<String> name, @ApiParam(value = "") @Valid @RequestParam(value = "typed", required = false) Optional<String> typed, @ApiParam(value = "") @Valid @RequestParam(value = "pid", required = false) Optional<String> pid, @ApiParam(value = "A search term.") @Valid @RequestParam(value = "search", required = false) Optional<String> search, @ApiParam(value = "Which field to use when ordering the results.") @Valid @RequestParam(value = "ordering", required = false) Optional<String> ordering, @ApiParam(value = "A page number within the paginated result set.") @Valid @RequestParam(value = "page", required = false) Optional<Integer> page, @ApiParam(value = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) Optional<Integer> limit);


    @ApiOperation(value = "数据类型管理", nickname = "multipleDelete", notes = "数据类型管理", tags = {"datatype",})
    @RequestMapping(value = "/datatype/multiple_delete", method = RequestMethod.DELETE)
    R multipleDelete(@ApiParam(value = "", required = true) @Valid @RequestBody MultiDelete data);


    @ApiOperation(value = "数据类型管理", nickname = "partialUpdate", notes = "数据类型管理", tags = {"datatype",})
    @RequestMapping(value = "/datatype/{id}", method = RequestMethod.PATCH)
    R partialUpdate(@ApiParam(value = "A unique integer value identifying this 数据类型.", required = true) @PathVariable("id") Integer id, @ApiParam(value = "", required = true) @Valid @RequestBody Lowdatatyped data);


    @ApiOperation(value = "数据类型管理", nickname = "read", notes = "单例", tags = {"datatype",})
    @RequestMapping(value = "/datatype/{id}", method = RequestMethod.GET)
    R read(@ApiParam(value = "A unique integer value identifying this 数据类型.", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "数据类型管理", nickname = "treeRead", notes = "用于前端菜单树结构树", tags = {"datatype",})
    @RequestMapping(value = "/datatype/tree", method = RequestMethod.GET)
    R treeRead(@ApiParam(value = "") @Valid @RequestParam(value = "description", required = false) Optional<String> description, @ApiParam(value = "") @Valid @RequestParam(value = "creator", required = false) Optional<String> creator, @ApiParam(value = "") @Valid @RequestParam(value = "modifier", required = false) Optional<String> modifier, @ApiParam(value = "") @Valid @RequestParam(value = "dept_belong_id", required = false) Optional<String> deptBelongId, @ApiParam(value = "") @Valid @RequestParam(value = "update_datetime", required = false) Optional<String> updateDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "create_datetime", required = false) Optional<String> createDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "is_deleted", required = false) Optional<BigDecimal> isDeleted, @ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) Optional<String> name, @ApiParam(value = "") @Valid @RequestParam(value = "typed", required = false) Optional<String> typed, @ApiParam(value = "") @Valid @RequestParam(value = "pid", required = false) Optional<String> pid, @ApiParam(value = "A search term.") @Valid @RequestParam(value = "search", required = false) Optional<String> search, @ApiParam(value = "Which field to use when ordering the results.") @Valid @RequestParam(value = "ordering", required = false) Optional<String> ordering, @ApiParam(value = "A page number within the paginated result set.") @Valid @RequestParam(value = "page", required = false) Optional<Integer> page, @ApiParam(value = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) Optional<Integer> limit);


    @ApiOperation(value = "数据类型管理", nickname = "treev2", notes = "用于前端菜单树结构树", tags = {"datatype",})
    @RequestMapping(value = "/datatype/treev2", method = RequestMethod.GET)
    R treev2(@ApiParam(value = "") @Valid @RequestParam(value = "description", required = false) Optional<String> description, @ApiParam(value = "") @Valid @RequestParam(value = "creator", required = false) Optional<String> creator, @ApiParam(value = "") @Valid @RequestParam(value = "modifier", required = false) Optional<String> modifier, @ApiParam(value = "") @Valid @RequestParam(value = "dept_belong_id", required = false) Optional<String> deptBelongId, @ApiParam(value = "") @Valid @RequestParam(value = "update_datetime", required = false) Optional<String> updateDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "create_datetime", required = false) Optional<String> createDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "is_deleted", required = false) Optional<BigDecimal> isDeleted, @ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) Optional<String> name, @ApiParam(value = "") @Valid @RequestParam(value = "typed", required = false) Optional<String> typed, @ApiParam(value = "") @Valid @RequestParam(value = "pid", required = false) Optional<String> pid, @ApiParam(value = "A search term.") @Valid @RequestParam(value = "search", required = false) Optional<String> search, @ApiParam(value = "Which field to use when ordering the results.") @Valid @RequestParam(value = "ordering", required = false) Optional<String> ordering, @ApiParam(value = "A page number within the paginated result set.") @Valid @RequestParam(value = "page", required = false) Optional<Integer> page, @ApiParam(value = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) Optional<Integer> limit);


    @ApiOperation(value = "数据类型管理", nickname = "update", notes = "修改", tags = {"datatype",})
    @RequestMapping(value = "/datatype/{id}", method = RequestMethod.PUT)
    R update(@ApiParam(value = "A unique integer value identifying this 数据类型.", required = true) @PathVariable("id") Long id, @ApiParam(value = "", required = true) @Valid @RequestBody Lowdatatyped data);

}
