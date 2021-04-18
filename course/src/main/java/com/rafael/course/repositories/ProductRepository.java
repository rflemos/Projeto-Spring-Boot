package com.rafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.course.entities.Product;
//opcianal o registro da classe como repository pois ela ja herda da classe Jpa Repository;
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	

}
