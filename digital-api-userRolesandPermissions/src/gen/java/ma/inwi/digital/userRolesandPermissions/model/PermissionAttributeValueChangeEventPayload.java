package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import ma.inwi.digital.userRolesandPermissions.model.Permission;

import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The event data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class PermissionAttributeValueChangeEventPayload   {
  
  private Permission permission = null;

  /**
   * The involved resource data for the event
   **/
  
  @ApiModelProperty(value = "The involved resource data for the event")
  @JsonProperty("permission")
  public Permission getPermission() {
    return permission;
  }
  public void setPermission(Permission permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionAttributeValueChangeEventPayload permissionAttributeValueChangeEventPayload = (PermissionAttributeValueChangeEventPayload) o;
    return Objects.equals(permission, permissionAttributeValueChangeEventPayload.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionAttributeValueChangeEventPayload {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

