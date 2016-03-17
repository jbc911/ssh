package com.jbc.service;

import java.util.List;

import com.jbc.model.BUser;

public interface IUserService {
	public List<BUser> findAll()throws Exception;
}
