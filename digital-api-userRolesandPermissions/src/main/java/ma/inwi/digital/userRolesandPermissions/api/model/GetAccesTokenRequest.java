package ma.inwi.digital.userRolesandPermissions.api.model;

import lombok.Data;
import ma.inwi.digital.commun.wrapper.GenericOperation;

@Data
public class GetAccesTokenRequest extends GenericOperation{

	private String org_link;
	private String username;
	private String password;
	private String grant_type;
	private String client_id;
	private String client_secret;
	
	
	public String getOrg_link() {
		return org_link;
	}
	public void setOrg_link(String org_link) {
		this.org_link = org_link;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	
	
	
	
	
}
