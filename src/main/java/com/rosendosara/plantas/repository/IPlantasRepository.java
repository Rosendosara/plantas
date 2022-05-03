 package com.rosendosara.plantas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosendosara.plantas.entities.Planta;

public interface IPlantasRepository extends JpaRepository<Planta, Integer>  {

}
