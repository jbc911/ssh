package com.jbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbc.dao.IUserDao;
import com.jbc.dao.impl.UserDao;
import com.jbc.model.BUser;
import com.jbc.service.IUserService;
@Service("userService")
public class UserService implements IUserService{
	@Autowired
	private IUserDao userDao;
	@Override
	public List<BUser> findAll() throws Exception{
		return userDao.findAll();
	}

}
