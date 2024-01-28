package cn.net.zerocode.loco.entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MultiDelete
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-22T20:40:48.565+08:00")




public class MultiDelete   {
  @JsonProperty("keys")
  @Valid
  private List<Object> keys = null;

  public MultiDelete keys(List<Object> keys) {
    this.keys = keys;
    return this;
  }

  public MultiDelete addKeysItem(Object keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<Object>();
    }
    this.keys.add(keysItem);
    return this;
  }

  /**
   * 主键列表
   * @return keys
  **/
  @ApiModelProperty(value = "主键列表")
  public List getKeys() {
    return keys;
  }

  public void setKeys(List<Object> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiDelete multiDelete = (MultiDelete) o;
    return Objects.equals(this.keys, multiDelete.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiDelete {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

