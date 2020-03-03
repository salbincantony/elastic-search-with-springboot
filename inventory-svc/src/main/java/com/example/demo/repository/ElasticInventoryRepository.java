package com.example.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.ESProduct;
import com.example.demo.domain.Product;

public interface ElasticInventoryRepository extends ElasticsearchRepository<ESProduct,String> {

	ESProduct findByName(String name);

}
