package ma.inwi.digital.userRolesandPermissions.api;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.PATCH;
import ma.inwi.digital.userRolesandPermissions.api.model.GetAccesTokenRequest;
import ma.inwi.digital.userRolesandPermissions.model.Error;
import ma.inwi.digital.userRolesandPermissions.model.Permission;
import ma.inwi.digital.userRolesandPermissions.model.PermissionCreate;
import ma.inwi.digital.userRolesandPermissions.model.PermissionUpdate;

@Path("/permission")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@io.swagger.annotations.Api(description = "the permission API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class PermissionApi {

	@Inject
	PermissionApiService service;

	@POST

	@Consumes({ "application/json;charset=utf-8" })
	@Produces({ "application/json;charset=utf-8" })
	@io.swagger.annotations.ApiOperation(value = "Creates a Permission", notes = "This operation creates a Permission entity.", response = Permission.class, tags = {
			"permission", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Permission.class),

			@io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public Response createPermission(
			@ApiParam(value = "The Permission to be created", required = true) PermissionCreate permission,
			@Context SecurityContext securityContext) throws NotFoundException {
		return service.createPermission(permission, securityContext);
	}

	@GET

	@Consumes({ "application/json;charset=utf-8" })
	@Produces({ "application/json;charset=utf-8" })
	@io.swagger.annotations.ApiOperation(value = "List or find Permission objects", notes = "This operation list or find Permission entities", response = Permission.class, responseContainer = "List", tags = {
			"permission", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Permission.class, responseContainer = "List"),

			@io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public Response listPermission(@QueryParam("fields") String fields, @QueryParam("offset") Integer offset,
			@QueryParam("limit") Integer limit, @Context SecurityContext securityContext) throws NotFoundException {
		return service.listPermission(fields, offset, limit, securityContext);
	}

	@PATCH
	@Path("/{id}")
	@Consumes({ "application/json;charset=utf-8" })
	@Produces({ "application/json;charset=utf-8" })
	@io.swagger.annotations.ApiOperation(value = "Updates partially a Permission", notes = "This operation updates partially a Permission entity.", response = Permission.class, tags = {
			"permission", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "Updated", response = Permission.class),

			@io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public Response patchPermission(@PathParam("id") String id,
			@ApiParam(value = "The Permission to be updated", required = true) PermissionUpdate permission,
			@Context SecurityContext securityContext) throws NotFoundException {
		return service.patchPermission(id, permission, securityContext);
	}

	@GET
	@Path("/{id}")
	@Consumes({ "application/json;charset=utf-8" })
	@Produces({ "application/json;charset=utf-8" })
	@io.swagger.annotations.ApiOperation(value = "Retrieves a Permission by ID", notes = "This operation retrieves a Permission entity. Attribute selection is enabled for all first level attributes.", response = Permission.class, tags = {
			"permission", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Permission.class),

			@io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public Response retrievePermission(@PathParam("id") String id, @QueryParam("fields") String fields,
			@Context SecurityContext securityContext) throws NotFoundException {
		return service.retrievePermission(id, fields, securityContext);
	}

	@POST
	@Path("/GetAccesTokenSFC")
	@Consumes({ "application/json;charset=utf-8" })
	@Produces({ "application/json;charset=utf-8" })
	@io.swagger.annotations.ApiOperation(value = "List or find Product objects", notes = "This operation list or find SUBProduct entities", response = Permission.class, responseContainer = "List", tags = {
			"permission", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Permission.class, responseContainer = "List"),

			@io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 409, message = "Conflict", response = Error.class),

			@io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public Response getAccesTokenSFC(@ApiParam(value = "Request body wrapper" ,required=true) GetAccesTokenRequest getAccesTokenRequest  , @Context SecurityContext securityContext) throws NotFoundException {
		return service.getAccesTokenSFC(getAccesTokenRequest ,securityContext);
	}
}
