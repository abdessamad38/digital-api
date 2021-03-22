package ma.inwi.digital.userRolesandPermissions.api;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;
import ma.inwi.digital.userRolesandPermissions.api.HubApiService;
import ma.inwi.digital.userRolesandPermissions.api.NotFoundException;
import ma.inwi.digital.userRolesandPermissions.model.*;
import ma.inwi.digital.userRolesandPermissions.model.Error;

import java.util.Map;
import java.util.List;
import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/hub")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@io.swagger.annotations.Api(description = "the hub API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class HubApi  {

    @Inject HubApiService service;

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Register a listener", notes = "Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.", response = EventSubscription.class, tags={ "events subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Subscribed", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response registerListener(@ApiParam(value = "Data containing the callback endpoint to deliver the information" ,required=true) EventSubscriptionInput data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.registerListener(data,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Unregister a listener", notes = "Resets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.", response = Void.class, tags={ "events subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Deleted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response unregisterListener( @PathParam("id") String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.unregisterListener(id,securityContext);
    }
}
