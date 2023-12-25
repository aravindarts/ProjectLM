package com.projectLM.repository;

import com.projectLM.entities.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnitsRepo extends JpaRepository<Units,Integer> {

}