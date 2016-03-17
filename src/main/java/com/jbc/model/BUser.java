package com.jbc.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "b_user")
public class BUser {
	@Id
	@GeneratedValue
	@Column(name = "user_id", unique = true, nullable = false)
	private Integer userId;
	@Column(name = "user_name", length = 20)
	private String userName;
	@Column(name = "user_password", length = 20)
	private String userPassword;
	@Column(name = "user_level")
	private Integer userLevel;
	@Column(name = "user_des", length = 20)
	private String userDes;
	@Column(name = "user_tel", length = 20)
	private String userTel;
	@Column(name = "user_address", length = 200)
	private String userAddress;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public String getUserDes() {
		return userDes;
	}

	public void setUserDes(String userDes) {
		this.userDes = userDes == null ? null : userDes.trim();
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel == null ? null : userTel.trim();
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress == null ? null : userAddress.trim();
	}

	@Override
	public String toString() {
		return "BUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userLevel="
				+ userLevel + ", userDes=" + userDes + ", userTel=" + userTel + ", userAddress=" + userAddress + "]";
	}

}