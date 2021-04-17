package com.rafael.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.course.entities.Category;
import com.rafael.course.repositories.CategoryRepository;

//@Component//Registra a classe como componte para que ela possa ser usada pra realizar a injeção de dependencia com a anotação @Autowired; 

@Service
public class CategoryService  {
	
	@Autowired
	private CategoryRepository repository;
	
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}


}
