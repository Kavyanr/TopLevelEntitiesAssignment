package com.capgemini.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Geo")
public class GeoModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int geoId;
	private int geotypeId;
	private String geoName;
	private int geoCode;
	private int geoSecCode;
	private String abbrevation;
	public int getGeoId() {
		return geoId;
	}
	public void setGeoId(int geoId) {
		this.geoId = geoId;
	}
	public int getGeotypeId() {
		return geotypeId;
	}
	public void setGeotypeId(int geotypeId) {
		this.geotypeId = geotypeId;
	}
	public String getGeoName() {
		return geoName;
	}
	public void setGeoName(String geoName) {
		this.geoName = geoName;
	}
	public int getGeoCode() {
		return geoCode;
	}
	public void setGeoCode(int geoCode) {
		this.geoCode = geoCode;
	}
	public int getGeoSecCode() {
		return geoSecCode;
	}
	public void setGeoSecCode(int geoSecCode) {
		this.geoSecCode = geoSecCode;
	}
	public String getAbbrevation() {
		return abbrevation;
	}
	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}
	
	
	public GeoModel(int geoId, int geoTypeId, String geoName, int geoCode,
			int geoSecCode, String abbrevation) {
		super();
		this.geoId = geoId;
		this.geotypeId = geoTypeId;
		this.geoName = geoName;
		this.geoCode = geoCode;
		this.geoSecCode = geoSecCode;
		this.abbrevation = abbrevation;
		
	}

	

	@Override
	public String toString() {
		return "Geo [geoId=" + geoId + ", geoTypeId=" + geotypeId + ", geoName=" + geoName
				+ ", geoCode=" + geoCode + ", geoSecCode=" + geoSecCode
				+ ", abbrevation=" + abbrevation +  "]";
	}
	
}
