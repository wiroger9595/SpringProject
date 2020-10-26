package com.springProject.onlineFurniture.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springProject.onlineFurniture.enity.Furniture;
import com.springProject.onlineFurniture.enity.FurnitureCategory;

@RepositoryRestResource(collectionResourceRel = "furnitureCategory", path = "furniture-category")
public interface FurnitureCategoryRepository extends JpaRepository<FurnitureCategory, Long>{
	
	
	
}
