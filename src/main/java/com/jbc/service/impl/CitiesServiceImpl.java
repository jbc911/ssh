package com.jbc.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbc.model.Cities;
import com.jbc.service.CitiesService;

@Service("citiesService")
public class CitiesServiceImpl implements CitiesService {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Cities> findByPid(long pid) {
		return sessionFactory.getCurrentSession().createQuery("From Cities where pid = " + pid).list();
	}
}
