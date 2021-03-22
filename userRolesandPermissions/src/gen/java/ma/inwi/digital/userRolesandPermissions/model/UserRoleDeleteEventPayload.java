package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import ma.inwi.digital.userRolesandPermissions.model.UserRole;

import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The event data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class UserRoleDeleteEventPayload   {
  
  private UserRole userRole = null;

  /**
   * The involved resource data for the event
   **/
  
  @ApiModelProperty(value = "The involved resource data for the event")
  @JsonProperty("userRole")
  public UserRole getUserRole() {
    return userRole;
  }
  public void setUserRole(UserRole userRole) {
    this.userRole = userRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoleDeleteEventPayload userRoleDeleteEventPayload = (UserRoleDeleteEventPayload) o;
    return Objects.equals(userRole, userRoleDeleteEventPayload.userRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoleDeleteEventPayload {\n");
    
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
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

