package ma.inwi.digital.userRolesandPermissions.api.impl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import ma.inwi.digital.commun.tools.ContextUtils;
import ma.inwi.digital.commun.tools.IConstantes;
import ma.inwi.digital.commun.tools.ValidateUtils;
import ma.inwi.digital.commun.wrapper.GetAccesTokenSFCResponse;
import ma.inwi.digital.userRolesandPermissions.api.ApiResponseMessage;
import ma.inwi.digital.userRolesandPermissions.api.NotFoundException;
import ma.inwi.digital.userRolesandPermissions.api.PermissionApiService;
import ma.inwi.digital.userRolesandPermissions.api.model.GetAccesTokenRequest;
import ma.inwi.digital.userRolesandPermissions.api.model.SFCJsonResponse;
import ma.inwi.digital.userRolesandPermissions.model.Error;
import ma.inwi.digital.userRolesandPermissions.model.PermissionCreate;
import ma.inwi.digital.userRolesandPermissions.model.PermissionUpdate;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class PermissionApiServiceImpl implements PermissionApiService {

	@Context
	private HttpHeaders httpHeaders;
	private static String sfB2B;
	private static String sfB2C;
	private static String sfWin;
	private static Integer validityPeriod;

	static LoadingCache<String, GetAccesTokenSFCResponse> tokensCacheSFB2B;
	static LoadingCache<String, GetAccesTokenSFCResponse> tokensCacheSFB2C;
	static LoadingCache<String, GetAccesTokenSFCResponse> tokensCacheWin;

	static private GetAccesTokenSFCResponse getToken(String id,
			LoadingCache<String, GetAccesTokenSFCResponse> tokensCache) throws ExecutionException {
		final GetAccesTokenSFCResponse token = tokensCache.get(id);
		return token;
	}

	static {
		if (IConstantes.USE_GATEWAY_CONFIG) {

			Map<String, String> rb = null;
			try {
				rb = ContextUtils.getParams(System.getProperty("Gateway"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			sfB2B = rb.get("host.sfc.b2b.tocken.url");
			sfB2C = rb.get("host.sfc.b2c.tocken.url");
			sfWin = rb.get("host.sfc.win.tocken.url");
			validityPeriod = Integer.valueOf(rb.get("token.default.validity.period"));
		} else {
			ResourceBundle rb = ResourceBundle.getBundle("config.params");
			sfB2B = rb.getString("host.sfc.b2b.tocken.url");
			sfB2C = rb.getString("host.sfc.b2c.tocken.url");
			sfWin = rb.getString("host.sfc.win.tocken.url");
			validityPeriod = Integer.valueOf(rb.getString("token.default.validity.period"));
		}

	}

	public Response createPermission(PermissionCreate permission, SecurityContext securityContext)
			throws NotFoundException {
		// do some magic!
		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
	}

	public Response listPermission(String fields, Integer offset, Integer limit, SecurityContext securityContext)
			throws NotFoundException {
		// do some magic!
		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
	}

	public Response patchPermission(String id, PermissionUpdate permission, SecurityContext securityContext)
			throws NotFoundException {
		// do some magic!
		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
	}

	public Response retrievePermission(String id, String fields, SecurityContext securityContext)
			throws NotFoundException {
		// do some magic!
		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
	}

	@Override
	public Response getAccesTokenSFC(GetAccesTokenRequest getAccesTokenRequest, SecurityContext securityContext) throws NotFoundException {

		String canal = ContextUtils.getCanalFromContext(httpHeaders);
		String SFCUrl = null;

		if (ValidateUtils.isEmpty(getAccesTokenRequest.getUsername()) || ValidateUtils.isEmpty(getAccesTokenRequest.getPassword()) || ValidateUtils.isEmpty(getAccesTokenRequest.getGrant_type())
				|| ValidateUtils.isEmpty(getAccesTokenRequest.getClient_id()) || ValidateUtils.isEmpty(getAccesTokenRequest.getClient_secret())) {
			Error error = new Error();
			error.setStatus("0");
			error.setCode("API-001");
			error.setReason("INVALID_PARAMETER");
			error.setMessage(
					" Certaines informations sont manquantes au niveau de la requête : USERNAME, PASSWORD, GRANT_TYPE, CLIENT_ID ou CLIENT_SECRET");
			return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
		}

		if ("SFB2B".equals(canal) && tokensCacheSFB2B != null && tokensCacheSFB2B.getIfPresent(canal) != null) {
			GetAccesTokenSFCResponse token = tokensCacheSFB2B.getIfPresent(canal);
			return Response.ok().entity(token).build();
		}

		if ("SFB2C".equals(canal) && tokensCacheSFB2C != null && tokensCacheSFB2C.getIfPresent(canal) != null) {
			GetAccesTokenSFCResponse token = tokensCacheSFB2C.getIfPresent(canal);
			return Response.ok().entity(token).build();
		}

		if ("WIN".equals(canal) && tokensCacheWin != null && tokensCacheWin.getIfPresent(canal) != null) {
			GetAccesTokenSFCResponse token = tokensCacheWin.getIfPresent(canal);
			return Response.ok().entity(token).build();
		}

		if (!ValidateUtils.isEmpty(getAccesTokenRequest.getOrg_link()))
			SFCUrl = getAccesTokenRequest.getOrg_link();
		else {
			if ("SFB2C".equals(canal))
				SFCUrl = sfB2C;

			if ("WIN".equals(canal))
				SFCUrl = sfWin;

			if ("SFB2B".equals(canal))
				SFCUrl = sfB2B;
		}
		try {
			List<NameValuePair> urlParameters = new ArrayList<>();
			String result = null;
			urlParameters.add(new BasicNameValuePair("username", getAccesTokenRequest.getUsername()));
			urlParameters.add(new BasicNameValuePair("password", getAccesTokenRequest.getPassword()));
			urlParameters.add(new BasicNameValuePair("client_secret", getAccesTokenRequest.getClient_secret()));
			urlParameters.add(new BasicNameValuePair("client_id", getAccesTokenRequest.getClient_id()));
			urlParameters.add(new BasicNameValuePair("grant_type", getAccesTokenRequest.getGrant_type()));

			HttpPost request = new HttpPost(SFCUrl);

			request.setEntity(new UrlEncodedFormEntity(urlParameters));
			request.addHeader("Accept", "application/json");
			request.addHeader("Content-Type", "application/x-www-form-urlencoded");

			CloseableHttpClient httpClient = HttpClients.createDefault();
			CloseableHttpResponse response = httpClient.execute(request);

			result = EntityUtils.toString(response.getEntity());

			ObjectMapper mapper = new ObjectMapper();

			SFCJsonResponse readValue;
			if (result != null) {
				readValue = mapper.readValue(result, SFCJsonResponse.class);

				if (!ValidateUtils.isEmpty(readValue.getPeriod_validity()))
					validityPeriod = Integer.valueOf(readValue.getPeriod_validity());

				GetAccesTokenSFCResponse tokenresponse = new GetAccesTokenSFCResponse(SFCUrl,
						readValue.getAccess_token(), readValue.getToken_type(), readValue.getInstance_url(),
						new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),
						String.valueOf(validityPeriod) + "H", "1", "");

				if ("SFB2B".equals(canal)) {
					tokensCacheSFB2B = CacheBuilder.newBuilder().maximumSize(10)
							.expireAfterWrite(validityPeriod, TimeUnit.HOURS)
							.build(new CacheLoader<String, GetAccesTokenSFCResponse>() {
								public GetAccesTokenSFCResponse load(String id) throws ExecutionException {
									final GetAccesTokenSFCResponse toDo = PermissionApiServiceImpl.getToken(id,
											tokensCacheSFB2B);
									return toDo;
								}
							});
					tokensCacheSFB2B.put(canal, tokenresponse);
				}

				if ("SFB2C".equals(canal)) {
					tokensCacheSFB2C = CacheBuilder.newBuilder().maximumSize(10)
							.expireAfterWrite(validityPeriod, TimeUnit.HOURS)
							.build(new CacheLoader<String, GetAccesTokenSFCResponse>() {
								public GetAccesTokenSFCResponse load(String id) throws ExecutionException {
									final GetAccesTokenSFCResponse toDo = PermissionApiServiceImpl.getToken(id,
											tokensCacheSFB2C);
									return toDo;
								}
							});
					tokensCacheSFB2C.put(canal, tokenresponse);
				}
				if ("WIN".equals(canal)) {
					tokensCacheWin = CacheBuilder.newBuilder().maximumSize(10)
							.expireAfterWrite(validityPeriod, TimeUnit.HOURS)
							.build(new CacheLoader<String, GetAccesTokenSFCResponse>() {
								public GetAccesTokenSFCResponse load(String id) throws ExecutionException {
									final GetAccesTokenSFCResponse toDo = PermissionApiServiceImpl.getToken(id,
											tokensCacheWin);
									return toDo;
								}
							});
					tokensCacheWin.put(canal, tokenresponse);
				}
				return Response.ok().entity(tokenresponse).build();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Error error = new Error();
			error.setStatus("0");
			error.setCode("API-EXCEPT");
			error.setReason("INTERNAL_SERVER_ERROR");
			error.setMessage(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();
		}
		return null;
	}
}
