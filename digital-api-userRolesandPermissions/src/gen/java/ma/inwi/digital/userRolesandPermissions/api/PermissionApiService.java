package ma.inwi.digital.userRolesandPermissions.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ma.inwi.digital.userRolesandPermissions.api.model.GetAccesTokenRequest;
import ma.inwi.digital.userRolesandPermissions.model.PermissionCreate;
import ma.inwi.digital.userRolesandPermissions.model.PermissionUpdate;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public interface PermissionApiService {
      Response createPermission(PermissionCreate permission,SecurityContext securityContext)
      throws NotFoundException;
      Response listPermission(String fields,Integer offset,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response patchPermission(String id,PermissionUpdate permission,SecurityContext securityContext)
      throws NotFoundException;
      Response retrievePermission(String id,String fields,SecurityContext securityContext)
      throws NotFoundException;
      Response getAccesTokenSFC(GetAccesTokenRequest getAccesTokenRequest,SecurityContext securityContext)
    throws NotFoundException;
}
