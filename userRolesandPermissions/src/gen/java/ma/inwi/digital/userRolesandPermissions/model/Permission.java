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

import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The Permission resource represents the entitlement given by an individual (granter) to another individual (user) to get access to a set of his owned manageable assets. One single permission resource can hold information referring to privileges granted for multiple manageable assets.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class Permission   {
  
  private String id = null;
  private String href = null;
  private Date creationDate = null;
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
   * Unique identifier of the permission
   **/
  
  @ApiModelProperty(value = "Unique identifier of the permission")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hypertext Reference of the permission
   **/
  
  @ApiModelProperty(value = "Hypertext Reference of the permission")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Date when the payment was performed
   **/
  
  @ApiModelProperty(value = "Date when the payment was performed")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

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
    Permission permission = (Permission) o;
    return Objects.equals(id, permission.id) &&
        Objects.equals(href, permission.href) &&
        Objects.equals(creationDate, permission.creationDate) &&
        Objects.equals(description, permission.description) &&
        Objects.equals(assetUserRole, permission.assetUserRole) &&
        Objects.equals(granter, permission.granter) &&
        Objects.equals(privilege, permission.privilege) &&
        Objects.equals(user, permission.user) &&
        Objects.equals(validFor, permission.validFor) &&
        Objects.equals(baseType, permission.baseType) &&
        Objects.equals(schemaLocation, permission.schemaLocation) &&
        Objects.equals(type, permission.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, creationDate, description, assetUserRole, granter, privilege, user, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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

