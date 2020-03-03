package com.example.demo.service;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MaperManager;
import com.example.demo.domain.ESProduct;
import com.example.demo.domain.Product;
import com.example.demo.repository.ElasticInventoryRepository;
import com.example.demo.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;

	@Autowired
	ElasticInventoryRepository elasticInventoryRepository;

	public List<Product> saveProducts(List<Product> products) {

		inventoryRepository.saveAll(products);

		List<ESProduct> esProducts = new ArrayList<ESProduct>();

		products.forEach((product) -> {
			esProducts.add(new ESProduct("" + product.getId(), product.getName(), product.getCategory(),
					product.getPrice(), product.getQuantity(), product.getImage()));
		});

		elasticInventoryRepository.saveAll(esProducts);

		return products;
	}

	public ESProduct viewProducts(String name) {

		return elasticInventoryRepository.findByName(name);
	}

}
