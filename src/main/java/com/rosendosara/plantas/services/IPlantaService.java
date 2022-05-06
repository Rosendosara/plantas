package com.rosendosara.plantas.services;

import java.util.List;

import com.rosendosara.plantas.entities.Planta;

public interface IPlantaService {
	
	public void addPlantas(Planta c);
	
	 List<Planta> findAll();

}
