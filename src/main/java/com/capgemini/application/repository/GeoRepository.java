package com.capgemini.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.application.model.GeoModel;

@Repository
public interface GeoRepository extends JpaRepository <GeoModel, Integer> {

}
