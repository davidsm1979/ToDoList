package com.dscfgos.login_api.classes.wrappers;

public class User_Account 
{
	private Long id ;
	private Long user_id ;
	private String user_name ;
	private String email ;
	private String password ;
	private String password_hash ;
	private String password_token ;
	private String password_expire ;
	private String email_token ;
	private String user_account_status_code ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_hash() {
		return password_hash;
	}
	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}
	public String getPassword_token() {
		return password_token;
	}
	public void setPassword_token(String password_token) {
		this.password_token = password_token;
	}
	public String getPassword_expire() {
		return password_expire;
	}
	public void setPassword_expire(String password_expire) {
		this.password_expire = password_expire;
	}
	public String getEmail_token() {
		return email_token;
	}
	public void setEmail_token(String email_token) {
		this.email_token = email_token;
	}
	public String getUser_account_status_code() {
		return user_account_status_code;
	}
	public void setUser_account_status_code(String user_account_status_code) {
		this.user_account_status_code = user_account_status_code;
	}

	
	
	
}
