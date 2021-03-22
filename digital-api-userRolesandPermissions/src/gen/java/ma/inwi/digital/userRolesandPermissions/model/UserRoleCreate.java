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

@ApiModel(description="A UserRole defines access levels to operate over a given function that can be included in an asset. Skipped properties: id,href")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class UserRoleCreate   {
  
  private String involvementRole = null;
  private List<Entitlement> entitlement = new ArrayList<Entitlement>();
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;

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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("entitlement")
  @NotNull
 @Size(min=1)  public List<Entitlement> getEntitlement() {
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
    UserRoleCreate userRoleCreate = (UserRoleCreate) o;
    return Objects.equals(involvementRole, userRoleCreate.involvementRole) &&
        Objects.equals(entitlement, userRoleCreate.entitlement) &&
        Objects.equals(baseType, userRoleCreate.baseType) &&
        Objects.equals(schemaLocation, userRoleCreate.schemaLocation) &&
        Objects.equals(type, userRoleCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(involvementRole, entitlement, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoleCreate {\n");
    
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

