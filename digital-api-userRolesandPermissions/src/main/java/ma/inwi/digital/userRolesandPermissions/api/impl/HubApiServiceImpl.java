package ma.inwi.digital.userRolesandPermissions.api.impl;

import ma.inwi.digital.userRolesandPermissions.api.*;
import ma.inwi.digital.userRolesandPermissions.model.*;

import java.util.List;
import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class HubApiServiceImpl implements HubApiService {
      public Response registerListener(EventSubscriptionInput data,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response unregisterListener(String id,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
