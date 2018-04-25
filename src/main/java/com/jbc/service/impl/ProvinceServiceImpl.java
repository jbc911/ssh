package com.jbc.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbc.model.Province;
import com.jbc.service.ProvinceService;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Province province) {
		sessionFactory.getCurrentSession().save(province);
	}

	@Override
	public Province findById(long pid) {
		return (Province) sessionFactory.getCurrentSession().createQuery("From Province where id =" + pid).list()
				.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Province> pageList() {
		List list = sessionFactory.getCurrentSession().createQuery("From Province").list();
		return list;
	}

	@Override
	public void delete(Province province) {
		sessionFactory.getCurrentSession().delete(province);
	}

	@Override
	public void update(Province province) {
		sessionFactory.getCurrentSession().update(province);
	}
}
