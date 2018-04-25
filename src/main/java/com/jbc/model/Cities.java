package com.jbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class Cities {

	@Id
	@GeneratedValue
	@Column(name = "cid", unique = true, nullable = false)
	private Long cid;
	@Column(name = "pid")
	private Long pid;
	@Column(name = "cname", length = 200)
	private String cname;

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}