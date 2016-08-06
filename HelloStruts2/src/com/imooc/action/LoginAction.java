package com.imooc.action;

import com.imooc.po.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	
	public String login() {
		
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getBookList().get(0).getUsername() + ", " + user.getBookList().get(1).getUsername());
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public void validate() {
		if(user.getUsername() == null || "".equals(user.getUsername())) {
			this.addFieldError("username", "User name is empty.");
			// return INPUT;
		}
	}
	
}
