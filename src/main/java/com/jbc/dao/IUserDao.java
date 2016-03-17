package com.jbc.dao;

import java.util.List;

import com.jbc.model.BUser;

public interface IUserDao {
	public List<BUser> findAll() throws Exception;
}
