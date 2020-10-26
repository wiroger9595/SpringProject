package com.springProject.onlineFurniture.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springProject.onlineFurniture.enity.Furniture;

public interface FurnitureRepository extends JpaRepository<Furniture, Long>{
	@RestResource(path = "categoryid")
	Page<Furniture> findByCategoryId(@Param("id") Long id, Pageable pageable);
	
}
