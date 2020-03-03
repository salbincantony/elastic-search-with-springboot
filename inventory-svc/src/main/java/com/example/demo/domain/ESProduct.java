package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(indexName = "products", type = "customer")

public class ESProduct {
	
	@Id
	private String id;
	private String name;
	private String category;
	private String price;
	private String quantity;
	private String image;
	public ESProduct() {
		super();
	}
	public ESProduct(String id, String name, String category, String price, String quantity, String image) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
	}
	
	
}
