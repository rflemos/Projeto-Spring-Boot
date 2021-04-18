package com.rafael.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.course.entities.Product;
import com.rafael.course.repositories.ProductRepository;

//@Component//Registra a classe como componte para que ela possa ser usada pra realizar a injeção de dependencia com a anotação @Autowired; 

@Service
public class ProductService  {
	
	@Autowired
	private ProductRepository repository;
	
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}


}
