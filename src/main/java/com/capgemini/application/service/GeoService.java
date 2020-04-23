package com.capgemini.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.application.model.GeoModel;



@Service
public interface GeoService {

	public GeoModel addAllData(GeoModel model);
	public List<GeoModel> findAllRecord();
	public GeoModel fetchById(int id);
	public String deleteId(int id);
	public GeoModel updateData(int id, GeoModel updateDetails);
}
