package com.cai.action;

import com.opensymphony.xwork2.ActionSupport;


public class RegisterAction extends ActionSupport {
	
//	private static final String SUCCESS="success";

	private String username;
	
	private String password;
	
	public String excute(){
		return SUCCESS;
	}
	
	public String input(){
		
		return SUCCESS;
	}
	
	public String forwardHello(){
		
		return SUCCESS;
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
	
	
}
