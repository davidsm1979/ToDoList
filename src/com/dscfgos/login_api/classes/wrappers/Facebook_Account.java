package com.dscfgos.login_api.classes.wrappers;

public class Facebook_Account 
{
	private Long user_id ;
	private String facebook_id ;
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getFacebook_id() {
		return facebook_id;
	}
	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}
}
