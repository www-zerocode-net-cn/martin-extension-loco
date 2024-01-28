package cn.net.zerocode.loco.entity;

import java.util.Objects;
import cn.net.zerocode.loco.entity.Onlineapi;
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
 * InlineResponse2005
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-22T19:54:35.651+08:00")




public class InlineResponse2005   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("results")
  @Valid
  private List<Onlineapi> results = new ArrayList<Onlineapi>();

  public InlineResponse2005 count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InlineResponse2005 next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public InlineResponse2005 previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")


  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public InlineResponse2005 results(List<Onlineapi> results) {
    this.results = results;
    return this;
  }

  public InlineResponse2005 addResultsItem(Onlineapi resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Onlineapi> getResults() {
    return results;
  }

  public void setResults(List<Onlineapi> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.count, inlineResponse2005.count) &&
        Objects.equals(this.next, inlineResponse2005.next) &&
        Objects.equals(this.previous, inlineResponse2005.previous) &&
        Objects.equals(this.results, inlineResponse2005.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

