package com.imooc.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	private HttpServletRequest request = ServletActionContext.getRequest();

	@Override
	public String execute() throws Exception {
		System.out.println("Run Action");
		return SUCCESS;
	}

	public String add() {
		return SUCCESS;
	}
	
	public String update() {
		return "update";
	}
	
	public String delete() {
		request.setAttribute("path", "update");
		return "delete";
	}
	
}
