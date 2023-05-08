package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Attraction;


@Repository
public interface IARepositoriAttraction extends JpaRepository<Attraction, Long> {
	

	public Optional<Attraction> findById(Long id);
	
//	@Query(value = "SELECT a FROM Attractions a WHERE a.min_age >= :minAgeParam", nativeQuery = true)
//	public List<Attraction> listMinAge(Integer minAgeParam);
}
