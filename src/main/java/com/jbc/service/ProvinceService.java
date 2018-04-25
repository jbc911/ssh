package com.jbc.service;

import java.util.List;

import com.jbc.model.Province;

public interface ProvinceService {

	void save(Province province);

	Province findById(long parseLong);

	List<Province> pageList();

	void delete(Province province);

	void update(Province province);

}
