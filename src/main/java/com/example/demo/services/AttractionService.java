package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Attraction;
import com.example.demo.repositories.IARepositoriAttraction;

@Service
public class AttractionService {

	@Autowired
	private IARepositoriAttraction iaRepositoriAttraction;
	
	public Attraction saveAttraction (Attraction attraction) {
		iaRepositoriAttraction.save(attraction);
		return attraction;
	}
	
	public List<Attraction> listAttractions(){
		return iaRepositoriAttraction.findAll();
	}
	
//	public List<Attraction> listAttractionsByAge(Integer minAgeParam){
//		System.out.println("edad ingresada: " + minAgeParam);
//		return iaRepositoriAttraction.listMinAge(minAgeParam);
//	}
	
	
	
}
