package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import ma.inwi.digital.userRolesandPermissions.model.EntityRef;
import ma.inwi.digital.userRolesandPermissions.model.UserRoleRef;

import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The AssetUserRole is the detailed information concerning an individual user role")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class AssetUserRole   {
  
  private EntityRef manageableAsset = null;
  private UserRoleRef userRole = null;
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("manageableAsset")
  @NotNull
  public EntityRef getManageableAsset() {
    return manageableAsset;
  }
  public void setManageableAsset(EntityRef manageableAsset) {
    this.manageableAsset = manageableAsset;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("userRole")
  @NotNull
  public UserRoleRef getUserRole() {
    return userRole;
  }
  public void setUserRole(UserRoleRef userRole) {
    this.userRole = userRole;
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
    AssetUserRole assetUserRole = (AssetUserRole) o;
    return Objects.equals(manageableAsset, assetUserRole.manageableAsset) &&
        Objects.equals(userRole, assetUserRole.userRole) &&
        Objects.equals(baseType, assetUserRole.baseType) &&
        Objects.equals(schemaLocation, assetUserRole.schemaLocation) &&
        Objects.equals(type, assetUserRole.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manageableAsset, userRole, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetUserRole {\n");
    
    sb.append("    manageableAsset: ").append(toIndentedString(manageableAsset)).append("\n");
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
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

