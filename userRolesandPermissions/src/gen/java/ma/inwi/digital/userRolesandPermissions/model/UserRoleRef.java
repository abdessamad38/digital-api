package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A UserRoleRef is a detailed information concerning an individual access entitlement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class UserRoleRef   {
  
  private String id = null;
  private String href = null;
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private String referredType = null;

  /**
   * Unique identifier of the user role
   **/
  
  @ApiModelProperty(required = true, value = "Unique identifier of the user role")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hypertext Reference of the user role.
   **/
  
  @ApiModelProperty(value = "Hypertext Reference of the user role.")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
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

  /**
   * The actual type of the target instance when needed for disambiguation.
   **/
  
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoleRef userRoleRef = (UserRoleRef) o;
    return Objects.equals(id, userRoleRef.id) &&
        Objects.equals(href, userRoleRef.href) &&
        Objects.equals(baseType, userRoleRef.baseType) &&
        Objects.equals(schemaLocation, userRoleRef.schemaLocation) &&
        Objects.equals(type, userRoleRef.type) &&
        Objects.equals(referredType, userRoleRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoleRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

