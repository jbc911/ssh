package com.jbc.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.jbc.model.Province;
import com.jbc.service.CitiesService;
import com.jbc.service.ProvinceService;
import com.opensymphony.xwork2.ActionSupport;

@Action(value = "province", results = { @Result(name = "provinceList", location = "/jsp/provinceList.jsp"),
		@Result(name = "provinceCreate", location = "/jsp/provinceCreate.jsp"),
		@Result(name = "findByCriteria", type = "redirect", location = "/province!findByCriteria.action"),
		@Result(name = "provinceUpdate", location = "/jsp/provinceUpdate.jsp") })
@ParentPackage("basePackage")
@Namespace("/")
public class ProvinceAction {
	private Province province;

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Autowired
	private ProvinceService provinceService;
	@Autowired
	private CitiesService citysService;

	private HttpServletRequest request = ServletActionContext.getRequest();

	public String findById() throws Exception {

		return ActionSupport.SUCCESS;
	}

	public String findByCriteria() {
		request.setAttribute("plist", this.provinceService.pageList());
		return "provinceList";
	}

	public String toAdd() {
		return "provinceCreate";
	}

	public String doAdd() {
		this.provinceService.save(province);
		return "findByCriteria";
	}

	public String toUpdate() throws Exception {
		String pid = request.getParameter("pid");
		province = this.provinceService.findById(Long.parseLong(pid));
		return "provinceUpdate";
	}

	public String doUpdate() {
		this.provinceService.update(province);
		return "findByCriteria";
	}

	public String delete() throws Exception {
		String pid = request.getParameter("pid");
		province = (Province) this.provinceService.findById(Long.parseLong(pid));
		this.provinceService.delete(province);
		return "findByCriteria";
	}
}
