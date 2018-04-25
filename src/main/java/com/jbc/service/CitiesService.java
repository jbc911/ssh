package com.jbc.service;

import java.util.List;

import com.jbc.model.Cities;

public interface CitiesService {

	List<Cities> findByPid(long parseLong);
}
