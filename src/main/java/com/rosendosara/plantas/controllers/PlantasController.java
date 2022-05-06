package com.rosendosara.plantas.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.rosendosara.plantas.entities.Planta;
import com.rosendosara.plantas.services.IPlantaService;

@Controller
public class PlantasController {
@Autowired
		private IPlantaService PlantaService;

		@RequestMapping(value = "/crearPlantas")
		public ModelAndView crearNuevaPlanta( 
		
				@RequestParam(required=false) String nombre,
				@RequestParam(required=false) String ubicacion,
				@RequestParam(required=false) String descripcion,
				@RequestParam(required=false) String imagen,
				@RequestParam(required=false) String cuidados)
			
		{
				if(nombre!=null) {
					Planta c = new Planta (0, nombre,ubicacion,descripcion,imagen,cuidados);
					PlantaService.addPlantas(c);
				}
				List<Planta> plantas =PlantaService.findAll();
				ModelAndView mav = new ModelAndView();
				mav.setViewName("crear_plantas");
				mav.addObject("tipos_plantas", plantas);
				return mav;
		}
		
}
	
