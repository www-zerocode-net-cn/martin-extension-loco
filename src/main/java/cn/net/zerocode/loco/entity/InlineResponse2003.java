package cn.net.zerocode.loco.entity;

import java.util.Objects;
import cn.net.zerocode.loco.entity.Datasource;
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
 * InlineResponse2003
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-22T19:54:35.651+08:00")




public class InlineResponse2003   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("results")
  @Valid
  private List<Datasource> results = new ArrayList<Datasource>();

  public InlineResponse2003 count(Integer count) {
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

  public InlineResponse2003 next(String next) {
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

  public InlineResponse2003 previous(String previous) {
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

  public InlineResponse2003 results(List<Datasource> results) {
    this.results = results;
    return this;
  }

  public InlineResponse2003 addResultsItem(Datasource resultsItem) {
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

  public List<Datasource> getResults() {
    return results;
  }

  public void setResults(List<Datasource> results) {
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
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.count, inlineResponse2003.count) &&
        Objects.equals(this.next, inlineResponse2003.next) &&
        Objects.equals(this.previous, inlineResponse2003.previous) &&
        Objects.equals(this.results, inlineResponse2003.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
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

