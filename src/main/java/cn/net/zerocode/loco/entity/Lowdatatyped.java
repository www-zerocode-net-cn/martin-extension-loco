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
 * 数据类型
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
@TableName("lowcode_lowdatatyped")
@ApiModel(value="Lowdatatyped对象", description="数据类型")
public class Lowdatatyped implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer typed;

    private Long pidId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDatetime;

    @ApiModelProperty(value = "创建人")
    private Long creatorId;

    @ApiModelProperty(value = "数据归属部门")
    private String deptBelongId;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "是否软删除")
    private Long isDeleted;

    @ApiModelProperty(value = "修改人")
    private String modifier;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDatetime;


}
