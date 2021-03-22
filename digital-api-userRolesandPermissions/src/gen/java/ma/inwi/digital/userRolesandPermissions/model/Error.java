package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class Error   {
  
  private String code = null;
  private String reason = null;
  private String message = null;
  private String status = null;
  private String referenceError = null;
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;

  /**
   * Application relevant detail, defined in the API or a common list.
   **/
  
  @ApiModelProperty(required = true, value = "Application relevant detail, defined in the API or a common list.")
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Explanation of the reason for the error which can be shown to a client user.
   **/
  
  @ApiModelProperty(required = true, value = "Explanation of the reason for the error which can be shown to a client user.")
  @JsonProperty("reason")
  @NotNull
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * More details and corrective actions related to the error which can be shown to a client user.
   **/
  
  @ApiModelProperty(value = "More details and corrective actions related to the error which can be shown to a client user.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * HTTP Error code extension
   **/
  
  @ApiModelProperty(value = "HTTP Error code extension")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * URI of documentation describing the error.
   **/
  
  @ApiModelProperty(value = "URI of documentation describing the error.")
  @JsonProperty("referenceError")
  public String getReferenceError() {
    return referenceError;
  }
  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }

  /**
   * When sub-classing, this defines the super-class.
   **/
  
  @ApiModelProperty(value = "When sub-classing, this defines the super-class.")
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }
  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   **/
  
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  /**
   * When sub-classing, this defines the sub-class entity name.
   **/
  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name.")
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(code, error.code) &&
        Objects.equals(reason, error.reason) &&
        Objects.equals(message, error.message) &&
        Objects.equals(status, error.status) &&
        Objects.equals(referenceError, error.referenceError) &&
        Objects.equals(baseType, error.baseType) &&
        Objects.equals(schemaLocation, error.schemaLocation) &&
        Objects.equals(type, error.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, message, status, referenceError, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

