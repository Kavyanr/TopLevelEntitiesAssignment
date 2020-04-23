package com.capgemini.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.application.model.GeoModel;
import com.capgemini.application.service.GeoService;


@RestController
@RequestMapping(value ="/geo")
public class GeoController {

	
	@Autowired
	GeoService geoService;
	
	@PostMapping("/addAllData")
	public GeoModel addAllData(@RequestBody GeoModel model)
	{
		return geoService.addAllData(model);
		
	}
	@GetMapping("/getAll")
	public List<GeoModel> findAllRecords()
	{
		return geoService.findAllRecord();
	}
	
	@GetMapping("/fetchby/{id}")
	public GeoModel fetchById(int id)
	{
		return geoService.fetchById(id);
	}
	
	@DeleteMapping("/Deleteby/{id}")
	public String deleteId(int id)
	{
		return geoService.deleteId(id);
	}
	
	@PutMapping("/update/{id}")
	public GeoModel updateData(int id, GeoModel updateDetails) {
		return geoService.updateData(id, updateDetails);
	}
	
}
