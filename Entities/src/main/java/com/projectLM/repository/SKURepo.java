package com.projectLM.repository;

import com.projectLM.entities.Sku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SKURepo extends JpaRepository<Sku,Integer> {

}