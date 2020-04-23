package com.capgemini.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.application.Exception.CustomException;
import com.capgemini.application.model.GeoModel;
import com.capgemini.application.repository.GeoRepository;

public class GeoServiceImplementation implements GeoService {

	@Autowired
	private GeoRepository geoRepo;
	
	public GeoModel addAllData(GeoModel model)
	{
		return geoRepo.save(model);
		
	}
	public List<GeoModel> findAllRecord()
	{
		return geoRepo.findAll();
	}

	public GeoModel fetchById(int id) {
		return geoRepo.findById(id).orElseThrow(
				() -> new CustomException("Unable to fetch the record with id " + id + " check with your Database"));
	}
	
	public String deleteId(int id) {
		String records = geoRepo.findById(id).map(geo -> {
			geoRepo.delete(geo);
			return "Deleted Successfully!";
		}).orElseThrow(
				() -> new CustomException("Unable to delete the record"));
		return records;
	}

	public GeoModel updateData(int id, GeoModel updateDetails) {
		GeoModel update = fetchById(id);
		update.setGeotypeId(updateDetails.getGeotypeId());
		update.setGeoName(updateDetails.getGeoName());
		update.setGeoCode(updateDetails.getGeoCode());
		update.setGeoSecCode(updateDetails.getGeoSecCode());
		update.setAbbrevation(updateDetails.getAbbrevation());
		
		return addAllData(update);

	}
}
