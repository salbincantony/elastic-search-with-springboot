package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Product;
import com.example.demo.document.ProfileDocument;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public Iterable<Product> addToElasticSearch() {
		
		return productRepository.findAll();
	}

	public List<Product> findProductByName(String name) {
		
		List<Product> actualList = new ArrayList<Product>();
		Iterable<Product> iterable = productRepository.findAll();
		
		iterable.forEach(actualList::add);
		return actualList;
	}
}
