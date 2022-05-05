package com.rosendosara.plantas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosendosara.plantas.entities.Planta;
import com.rosendosara.plantas.repository.IPlantasRepository;

@Service
public class PlantaServiceImpl  implements IPlantaService{
	
	@Autowired
	IPlantasRepository plantasRepository;
	
	@Override
	public void addPlantas(Planta c) {
		plantasRepository.save(c);
	}

	@Override
	public List<Planta> findAll() {
		List<Planta> plantas = plantasRepository.findAll();
		return plantas;
	}

}
