/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.17).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cn.net.zerocode.loco.controller;

import cn.net.zerocode.loco.entity.MultiDelete;
import cn.net.zerocode.loco.entity.Route;
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

@Api(value = "route", description = "the route API")
@RequestMapping(value = "")
public interface RouteApi {

    @ApiOperation(value = "在线接口管理", nickname = "create", notes = "新增", tags = {"route",})
    @RequestMapping(value = "/route", method = RequestMethod.POST)
    R create(@ApiParam(value = "", required = true) @Valid @RequestBody Route data);


    @ApiOperation(value = "在线接口管理", nickname = "delete", notes = "删除", tags = {"route",})
    @RequestMapping(value = "/route/{id}", method = RequestMethod.DELETE)
    R delete(@ApiParam(value = "Id", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "在线接口管理", nickname = "list", notes = "查询", tags = {"route",})
    @RequestMapping(value = "/route", method = RequestMethod.GET)
    R list(@ApiParam(value = "") @Valid @RequestParam(value = "description", required = false) Optional<String> description, @ApiParam(value = "") @Valid @RequestParam(value = "creator", required = false) Optional<String> creator, @ApiParam(value = "") @Valid @RequestParam(value = "modifier", required = false) Optional<String> modifier, @ApiParam(value = "") @Valid @RequestParam(value = "dept_belong_id", required = false) Optional<String> deptBelongId, @ApiParam(value = "") @Valid @RequestParam(value = "update_datetime", required = false) Optional<String> updateDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "create_datetime", required = false) Optional<String> createDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "is_deleted", required = false) Optional<BigDecimal> isDeleted, @ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) Optional<String> name, @ApiParam(value = "") @Valid @RequestParam(value = "data_source", required = false) Optional<BigDecimal> dataSource, @ApiParam(value = "") @Valid @RequestParam(value = "datasource", required = false) Optional<String> datasource, @ApiParam(value = "") @Valid @RequestParam(value = "typed", required = false) Optional<String> typed, @ApiParam(value = "") @Valid @RequestParam(value = "methods", required = false) Optional<BigDecimal> methods, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) Optional<BigDecimal> sort, @ApiParam(value = "") @Valid @RequestParam(value = "status", required = false) Optional<BigDecimal> status, @ApiParam(value = "") @Valid @RequestParam(value = "cacheid", required = false) Optional<String> cacheid, @ApiParam(value = "") @Valid @RequestParam(value = "url", required = false) Optional<String> url, @ApiParam(value = "") @Valid @RequestParam(value = "sql", required = false) Optional<String> sql, @ApiParam(value = "") @Valid @RequestParam(value = "parameter", required = false) Optional<String> parameter, @ApiParam(value = "A search term.") @Valid @RequestParam(value = "search", required = false) Optional<String> search, @ApiParam(value = "Which field to use when ordering the results.") @Valid @RequestParam(value = "ordering", required = false) Optional<String> ordering, @ApiParam(value = "A page number within the paginated result set.") @Valid @RequestParam(value = "page", required = false) Optional<Integer> page, @ApiParam(value = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) Optional<Integer> limit);


    @ApiOperation(value = "在线接口管理", nickname = "multipleDelete", notes = "在线接口管理", tags = {"route",})
    @RequestMapping(value = "/route/multiple_delete", method = RequestMethod.DELETE)
    R multipleDelete(@ApiParam(value = "", required = true) @Valid @RequestBody MultiDelete data);


    @ApiOperation(value = "在线接口管理", nickname = "partialUpdate", notes = "在线接口管理", tags = {"route",})
    @RequestMapping(value = "/route/{id}", method = RequestMethod.PATCH)
    R partialUpdate(@ApiParam(value = "Id", required = true) @PathVariable("id") Integer id, @ApiParam(value = "", required = true) @Valid @RequestBody Route data);


    @ApiOperation(value = "在线接口管理", nickname = "postapi", notes = "用于前端菜单树结构树", tags = {"route",})
    @RequestMapping(value = "/route/postapi", method = RequestMethod.POST)
    R postapi(@ApiParam(value = "", required = true) @Valid @RequestBody Route data);


    @ApiOperation(value = "在线接口管理", nickname = "read", notes = "单例", tags = {"route",})
    @RequestMapping(value = "/route/{id}", method = RequestMethod.GET)
    R read(@ApiParam(value = "Id", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "在线接口管理", nickname = "update", notes = "修改", tags = {"route",})
    @RequestMapping(value = "/route/{id}", method = RequestMethod.PUT)
    R update(@ApiParam(value = "Id", required = true) @PathVariable("id") Long id, @ApiParam(value = "", required = true) @Valid @RequestBody Route data);

}
