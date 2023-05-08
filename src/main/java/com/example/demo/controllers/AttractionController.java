package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Attraction;
import com.example.demo.services.AttractionService;

@RestController
@CrossOrigin
@RequestMapping("/attraction")
public class AttractionController {

	@Autowired
	private AttractionService attractionService;
	
	@PostMapping("/saveAttraction")
	public Attraction saveAttraction(@RequestBody Attraction attraction) {
		
		return attractionService.saveAttraction(attraction);
	}
	
	@GetMapping("/listAttraactions")
	public List<Attraction> listAttractions(){
		return attractionService.listAttractions();
	}
	
	@GetMapping("/listMinAge/{minAgeParam}")
	public List<Attraction> listMinAge(@PathVariable Integer minAgeParam){
		
		System.out.println("edad ingresada: " + minAgeParam);
		List<Attraction> attractions = attractionService.listAttractions();
		List<Attraction> attractionsFound = new ArrayList<>();
		
		
		for (int i = 0; i < attractions.size(); i++) {
			
			if (attractions.get(i).getMinAge() > minAgeParam) {
				attractionsFound.add(attractions.get(i));
			}
		}
		
		
		return attractionsFound;
	}
	@GetMapping("/listMinHeight/{minHeightParam}")
	public List<Attraction> listMinHeight(@PathVariable Integer minHeightParam){
		
		System.out.println("edad ingresada: " + minHeightParam);
		List<Attraction> attractions = attractionService.listAttractions();
		List<Attraction> attractionsFound = new ArrayList<>();
		
		
		for (int i = 0; i < attractions.size(); i++) {
			
			if (attractions.get(i).getMinHeight() > minHeightParam) {
				attractionsFound.add(attractions.get(i));
			}
		}
		
		
		return attractionsFound;
	}
	
}
