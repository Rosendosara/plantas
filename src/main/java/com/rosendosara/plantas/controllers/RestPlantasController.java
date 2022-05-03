package com.rosendosara.plantas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosendosara.plantas.entities.Planta;
import com.rosendosara.plantas.services.IPlantaService;

@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController

public class RestPlantasController {
	@Autowired
	IPlantaService plantasService;
	@GetMapping(path="/plantas", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Planta> getPlantas(){
		return plantasService.findAll();
	}
}
