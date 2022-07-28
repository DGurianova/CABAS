package com.cabas.persistance.repository;

import com.cabas.persistance.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
