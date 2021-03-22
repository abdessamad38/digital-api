package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A period of time, either as a deadline (endDateTime only) a startDateTime only, or both")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class TimePeriod   {
  
  private Date endDateTime = null;
  private Date startDateTime = null;

  /**
   * End of the time period, using IETC-RFC-3339 format
   **/
  
  @ApiModelProperty(value = "End of the time period, using IETC-RFC-3339 format")
  @JsonProperty("endDateTime")
  public Date getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }

  /**
   * Start of the time period, using IETC-RFC-3339 format. If you define a start, you must also define an end
   **/
  
  @ApiModelProperty(value = "Start of the time period, using IETC-RFC-3339 format. If you define a start, you must also define an end")
  @JsonProperty("startDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(endDateTime, timePeriod.endDateTime) &&
        Objects.equals(startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

