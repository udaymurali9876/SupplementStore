package com.example.Supplements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Supplements.entity.Product;
import com.example.Supplements.repository.ProductRepository;

@Service
public class DashboardService {

	@Autowired
	public ProductRepository productRepo;
	
	public List<Product> getAllProductsList(){
		return productRepo.findAll();
	}
	
}