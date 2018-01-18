package com.dscfgos.login_api.classes.responses;

public class BaseResult 
{
	private String code 		= "0";
	private String description 	= "OK";
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
