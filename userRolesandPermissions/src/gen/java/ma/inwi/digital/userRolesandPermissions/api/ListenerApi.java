package ma.inwi.digital.userRolesandPermissions.api;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;
import ma.inwi.digital.userRolesandPermissions.api.ListenerApiService;
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

@Path("/listener")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@io.swagger.annotations.Api(description = "the listener API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class ListenerApi  {

    @Inject ListenerApiService service;

    @POST
    @Path("/permissionAttributeValueChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity PermissionAttributeValueChangeEvent", notes = "Example of a client listener for receiving the notification PermissionAttributeValueChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToPermissionAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true) PermissionAttributeValueChangeEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToPermissionAttributeValueChangeEvent(data,securityContext);
    }
    @POST
    @Path("/permissionCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity PermissionCreateEvent", notes = "Example of a client listener for receiving the notification PermissionCreateEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToPermissionCreateEvent(@ApiParam(value = "The event data" ,required=true) PermissionCreateEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToPermissionCreateEvent(data,securityContext);
    }
    @POST
    @Path("/permissionDeleteEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity PermissionDeleteEvent", notes = "Example of a client listener for receiving the notification PermissionDeleteEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToPermissionDeleteEvent(@ApiParam(value = "The event data" ,required=true) PermissionDeleteEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToPermissionDeleteEvent(data,securityContext);
    }
    @POST
    @Path("/permissionStateChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity PermissionStateChangeEvent", notes = "Example of a client listener for receiving the notification PermissionStateChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToPermissionStateChangeEvent(@ApiParam(value = "The event data" ,required=true) PermissionStateChangeEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToPermissionStateChangeEvent(data,securityContext);
    }
    @POST
    @Path("/userRoleAttributeValueChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity UserRoleAttributeValueChangeEvent", notes = "Example of a client listener for receiving the notification UserRoleAttributeValueChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToUserRoleAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true) UserRoleAttributeValueChangeEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToUserRoleAttributeValueChangeEvent(data,securityContext);
    }
    @POST
    @Path("/userRoleCreateEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity UserRoleCreateEvent", notes = "Example of a client listener for receiving the notification UserRoleCreateEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToUserRoleCreateEvent(@ApiParam(value = "The event data" ,required=true) UserRoleCreateEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToUserRoleCreateEvent(data,securityContext);
    }
    @POST
    @Path("/userRoleDeleteEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity UserRoleDeleteEvent", notes = "Example of a client listener for receiving the notification UserRoleDeleteEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToUserRoleDeleteEvent(@ApiParam(value = "The event data" ,required=true) UserRoleDeleteEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToUserRoleDeleteEvent(data,securityContext);
    }
    @POST
    @Path("/userRoleStateChangeEvent")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @io.swagger.annotations.ApiOperation(value = "Client listener for entity UserRoleStateChangeEvent", notes = "Example of a client listener for receiving the notification UserRoleStateChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    public Response listenToUserRoleStateChangeEvent(@ApiParam(value = "The event data" ,required=true) UserRoleStateChangeEvent data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listenToUserRoleStateChangeEvent(data,securityContext);
    }
}
