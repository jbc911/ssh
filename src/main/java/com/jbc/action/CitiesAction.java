package com.jbc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;

import com.jbc.model.Cities;
import com.jbc.service.CitiesService;
import com.opensymphony.xwork2.ActionSupport;

@Action(value = "cities", results = { @Result(location = "/index.jsp") })
@ParentPackage("basePackage")
@Namespace("/")
public class CitiesAction {
	@Autowired
	private CitiesService citysService;

	private HttpServletRequest request = ServletActionContext.getRequest();

	public String findById() throws Exception {
		String pid = request.getParameter("pid");
		List<Cities> pclist = new ArrayList<>();
		// 方法1
		// pclist =
		// this.citysService.findByCriteria(DetachedCriteria.forClass(Citys.class).add(Restrictions.eq("province.pid",
		// Long.parseLong(pid))));
		// 方法2
		// pclist = this.citysService.findByHQL("From Citys as c where c.province.pid =
		// "+pid);
		// 方法3
		pclist = this.citysService.findByPid(Long.parseLong(pid));
		request.setAttribute("pclist", pclist);
		return ActionSupport.SUCCESS;
	}
}
