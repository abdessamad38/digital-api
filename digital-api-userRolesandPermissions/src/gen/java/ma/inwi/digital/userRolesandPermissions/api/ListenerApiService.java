package ma.inwi.digital.userRolesandPermissions.api;

import ma.inwi.digital.userRolesandPermissions.api.*;
import ma.inwi.digital.userRolesandPermissions.model.*;

import java.util.List;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public interface ListenerApiService {
      Response listenToPermissionAttributeValueChangeEvent(PermissionAttributeValueChangeEvent data,SecurityContext securityContext)
      throws NotFoundException;
      Response listenToPermissionCreateEvent(PermissionCreateEvent data,SecurityContext securityContext)
      throws NotFoundException;
      Response listenToPermissionDeleteEvent(PermissionDeleteEvent data,SecurityContext securityContext)
      throws NotFoundException;
      Response listenToPermissionStateChangeEvent(PermissionStateChangeEvent data,SecurityContext securityContext)
      throws NotFoundException;
      Response listenToUserRoleAttributeValueChangeEvent(UserRoleAttributeValueChangeEvent data,SecurityContext securityContext)
      throws NotFoundException;
      Response listenToUserRoleCreateEvent(UserRoleCreateEvent data,SecurityContext securityContext)
      throws NotFoundException;
      Response listenToUserRoleDeleteEvent(UserRoleDeleteEvent data,SecurityContext securityContext)
      throws NotFoundException;
      Response listenToUserRoleStateChangeEvent(UserRoleStateChangeEvent data,SecurityContext securityContext)
      throws NotFoundException;
}
