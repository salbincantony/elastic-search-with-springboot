package com.example.demo.repository;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.document.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

	
	
}
