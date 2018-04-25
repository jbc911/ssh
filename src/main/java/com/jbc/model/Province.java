package com.jbc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "province")
public class Province implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6109843827045280266L;
	// Fields
	@Id
	@GeneratedValue
	@Column(name = "pid", unique = true, nullable = false)
	private Long pid;
	@Column(name = "pname", length = 200)
	private String pname;

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** full constructor */
	public Province(String pname) {
		this.pname = pname;
	}

	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}