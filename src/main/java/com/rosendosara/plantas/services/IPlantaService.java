package com.rosendosara.plantas.services;

import java.util.List;

import com.rosendosara.plantas.entities.Planta;

public interface IPlantaService {
	public List<Planta> findAll();

	public void addPlantas(Planta c);


}
