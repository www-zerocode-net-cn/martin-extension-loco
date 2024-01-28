/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.17).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cn.net.zerocode.loco.controller;

import com.java2e.martin.common.core.api.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-22T20:40:48.565+08:00")

@Api(value = "getassets", description = "the getassets API")
@RequestMapping(value = "")
public interface GetassetsApi {

    @ApiOperation(value = "物料获取-无需登入", nickname = "list", notes = "查询", tags = {"getassets",})
    @RequestMapping(value = "/getassets", method = RequestMethod.GET)
    R list(@ApiParam(value = "") @Valid @RequestParam(value = "description", required = false) Optional<String> description, @ApiParam(value = "") @Valid @RequestParam(value = "creator", required = false) Optional<String> creator, @ApiParam(value = "") @Valid @RequestParam(value = "modifier", required = false) Optional<String> modifier, @ApiParam(value = "") @Valid @RequestParam(value = "dept_belong_id", required = false) Optional<String> deptBelongId, @ApiParam(value = "") @Valid @RequestParam(value = "update_datetime", required = false) Optional<String> updateDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "create_datetime", required = false) Optional<String> createDatetime, @ApiParam(value = "") @Valid @RequestParam(value = "is_deleted", required = false) Optional<BigDecimal> isDeleted, @ApiParam(value = "") @Valid @RequestParam(value = "data", required = false) Optional<String> data, @ApiParam(value = "") @Valid @RequestParam(value = "version", required = false) Optional<String> version, @ApiParam(value = "") @Valid @RequestParam(value = "is_use", required = false) Optional<String> isUse, @ApiParam(value = "A search term.") @Valid @RequestParam(value = "search", required = false) Optional<String> search, @ApiParam(value = "Which field to use when ordering the results.") @Valid @RequestParam(value = "ordering", required = false) Optional<String> ordering, @ApiParam(value = "A page number within the paginated result set.") @Valid @RequestParam(value = "page", required = false) Optional<Integer> page, @ApiParam(value = "Number of results to return per page.") @Valid @RequestParam(value = "limit", required = false) Optional<Integer> limit);

}