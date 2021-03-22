package ma.inwi.digital.userRolesandPermissions.api;

import ma.inwi.digital.userRolesandPermissions.api.*;
import ma.inwi.digital.userRolesandPermissions.model.*;

import java.util.List;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public interface HubApiService {
      Response registerListener(EventSubscriptionInput data,SecurityContext securityContext)
      throws NotFoundException;
      Response unregisterListener(String id,SecurityContext securityContext)
      throws NotFoundException;
}
