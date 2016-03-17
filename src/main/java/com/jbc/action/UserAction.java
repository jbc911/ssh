package com.jbc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.jbc.model.BUser;
import com.jbc.service.IUserService;
@Action(value="userAction",results={@Result(name="userList",location="/WEB-INF/pages/userList.jsp")})
@ParentPackage("basePackage")
@Namespace("/")
public class UserAction {
	@Autowired
	private IUserService userService;
	
	public String findAll(){
		try {
			List<BUser> userList = userService.findAll();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("userList", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "userList";
	}
}
