package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import ma.inwi.digital.userRolesandPermissions.model.Entitlement;

import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A UserRole defines access levels to operate over a given function that can be included in an asset.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class UserRole   {
  
  private String id = null;
  private String href = null;
  private String involvementRole = null;
  private List<Entitlement> entitlement = new ArrayList<Entitlement>();
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;

  /**
   * Unique identifier of the userRole
   **/
  
  @ApiModelProperty(value = "Unique identifier of the userRole")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique URI used to access to the userRole resource
   **/
  
  @ApiModelProperty(value = "Unique URI used to access to the userRole resource")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Indication of the part that a user plays in its involvement with a manageable asset (product, service or resource)
   **/
  
  @ApiModelProperty(value = "Indication of the part that a user plays in its involvement with a manageable asset (product, service or resource)")
  @JsonProperty("involvementRole")
  public String getInvolvementRole() {
    return involvementRole;
  }
  public void setInvolvementRole(String involvementRole) {
    this.involvementRole = involvementRole;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("entitlement")
  public List<Entitlement> getEntitlement() {
    return entitlement;
  }
  public void setEntitlement(List<Entitlement> entitlement) {
    this.entitlement = entitlement;
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
    UserRole userRole = (UserRole) o;
    return Objects.equals(id, userRole.id) &&
        Objects.equals(href, userRole.href) &&
        Objects.equals(involvementRole, userRole.involvementRole) &&
        Objects.equals(entitlement, userRole.entitlement) &&
        Objects.equals(baseType, userRole.baseType) &&
        Objects.equals(schemaLocation, userRole.schemaLocation) &&
        Objects.equals(type, userRole.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, involvementRole, entitlement, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    involvementRole: ").append(toIndentedString(involvementRole)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
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

