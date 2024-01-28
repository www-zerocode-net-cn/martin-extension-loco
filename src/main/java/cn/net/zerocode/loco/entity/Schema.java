package cn.net.zerocode.loco.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * 模板
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
@TableName("lowcode_schema")
@ApiModel(value="Schema对象", description="模板")
public class Schema implements Serializable {

    private static final long serialVersionUID=1L;

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

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String schema;

    private Long menuId;

    @TableField("Typed_id")
    private Long typedId;

    @ApiModelProperty(value = "创建人")
    private Long creatorId;

    private Integer isLogin;


}
