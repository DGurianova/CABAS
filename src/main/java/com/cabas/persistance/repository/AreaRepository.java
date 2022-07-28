package com.cabas.persistance.repository;

import com.cabas.persistance.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AreaRepository extends JpaRepository<Area, Integer> {

    public List<Area> findAreaByName(String name);
}
