package cn.net.zerocode.loco.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import com.java2e.martin.common.core.annotation.BindField;
import com.java2e.martin.common.core.constant.CommonConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 核心模型
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("lowcode_onlineapi")
@ApiModel(value="Onlineapi对象", description="核心模型")
public class Onlineapi implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "Id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "修改人")
    private String modifier;

    @ApiModelProperty(value = "数据归属部门")
    private String deptBelongId;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDatetime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDatetime;

    @ApiModelProperty(value = "是否软删除")
    private Long isDeleted;

    private Integer dataSource;

    private Integer methods;

    @ApiModelProperty(value = "显示排序")
    private Integer sort;

    @ApiModelProperty(value = "是否发布")
    private Integer status;

    @ApiModelProperty(value = "sql")
    private String sql;

    @ApiModelProperty(value = "入参json数据")
    private String parameter;

    @ApiModelProperty(value = "创建人")
    private Long creatorId;

    private String url;

    private String cacheid;

    private String name;

    private Long typedId;

    private Long datasourceId;


}
