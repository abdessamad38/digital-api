package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import ma.inwi.digital.userRolesandPermissions.model.AssetUserRole;
import ma.inwi.digital.userRolesandPermissions.model.Privilege;
import ma.inwi.digital.userRolesandPermissions.model.RelatedParty;
import ma.inwi.digital.userRolesandPermissions.model.TimePeriod;

import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The Permission resource represents the entitlement given by an individual (granter) to another individual (user) to get access to a set of his owned manageable assets. One single permission resource can hold information referring to privileges granted for multiple manageable assets. Skipped properties: id,href,creationDate")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class PermissionUpdate   {
  
  private String description = null;
  private List<AssetUserRole> assetUserRole = new ArrayList<AssetUserRole>();
  private RelatedParty granter = null;
  private List<Privilege> privilege = new ArrayList<Privilege>();
  private RelatedParty user = null;
  private TimePeriod validFor = null;
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;

  /**
   * Text describing the contents of the payment
   **/
  
  @ApiModelProperty(value = "Text describing the contents of the payment")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetUserRole")
  public List<AssetUserRole> getAssetUserRole() {
    return assetUserRole;
  }
  public void setAssetUserRole(List<AssetUserRole> assetUserRole) {
    this.assetUserRole = assetUserRole;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("granter")
  public RelatedParty getGranter() {
    return granter;
  }
  public void setGranter(RelatedParty granter) {
    this.granter = granter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("privilege")
  public List<Privilege> getPrivilege() {
    return privilege;
  }
  public void setPrivilege(List<Privilege> privilege) {
    this.privilege = privilege;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("user")
  @NotNull
  public RelatedParty getUser() {
    return user;
  }
  public void setUser(RelatedParty user) {
    this.user = user;
  }

  /**
   * The period for which the permission is valid
   **/
  
  @ApiModelProperty(required = true, value = "The period for which the permission is valid")
  @JsonProperty("validFor")
  @NotNull
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
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
    PermissionUpdate permissionUpdate = (PermissionUpdate) o;
    return Objects.equals(description, permissionUpdate.description) &&
        Objects.equals(assetUserRole, permissionUpdate.assetUserRole) &&
        Objects.equals(granter, permissionUpdate.granter) &&
        Objects.equals(privilege, permissionUpdate.privilege) &&
        Objects.equals(user, permissionUpdate.user) &&
        Objects.equals(validFor, permissionUpdate.validFor) &&
        Objects.equals(baseType, permissionUpdate.baseType) &&
        Objects.equals(schemaLocation, permissionUpdate.schemaLocation) &&
        Objects.equals(type, permissionUpdate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, assetUserRole, granter, privilege, user, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assetUserRole: ").append(toIndentedString(assetUserRole)).append("\n");
    sb.append("    granter: ").append(toIndentedString(granter)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

