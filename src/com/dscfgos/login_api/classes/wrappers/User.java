package com.dscfgos.login_api.classes.wrappers;

public class User 
{
	private Long id ;
	private String first_name ;
	private String last_name ;
	private String email ;
	private Boolean accept_terms;
	private String time_zone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getAccept_terms() {
		return accept_terms;
	}
	public void setAccept_terms(Boolean accept_terms) {
		this.accept_terms = accept_terms;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	
	
}
