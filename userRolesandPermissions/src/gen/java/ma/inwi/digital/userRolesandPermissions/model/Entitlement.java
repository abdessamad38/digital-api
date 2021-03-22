package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="An Entitlement defines access levels to operate over a given function that can be included in an asset.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class Entitlement   {
  
  private String action = null;
  private String function = null;
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;

  /**
   * Level of access granted as part of the permission.
   **/
  
  @ApiModelProperty(value = "Level of access granted as part of the permission.")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Specific function that can be managed over a given asset.
   **/
  
  @ApiModelProperty(value = "Specific function that can be managed over a given asset.")
  @JsonProperty("function")
  public String getFunction() {
    return function;
  }
  public void setFunction(String function) {
    this.function = function;
  }

  /**
   * When sub-classing, this defines the super-class
   **/
  
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")
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
   * When sub-classing, this defines the sub-class entity name
   **/
  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
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
    Entitlement entitlement = (Entitlement) o;
    return Objects.equals(action, entitlement.action) &&
        Objects.equals(function, entitlement.function) &&
        Objects.equals(baseType, entitlement.baseType) &&
        Objects.equals(schemaLocation, entitlement.schemaLocation) &&
        Objects.equals(type, entitlement.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, function, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entitlement {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

