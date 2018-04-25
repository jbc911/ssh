package com.jbc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbc.dao.IUserDao;
import com.jbc.model.BUser;

@Repository("userDao")
public class UserDao implements IUserDao {
	@Autowired
	private SessionFactory sessionFaction;

	@Override
	public List<BUser> findAll() throws Exception {
		return sessionFaction.openSession().createQuery("from BUser").list();
	}

}
