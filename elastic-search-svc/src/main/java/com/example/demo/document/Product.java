package com.example.demo.document;

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

public class Product {
	
	@Id
	private String id;
	private String name;
	private String category;
	private String price;
	private String quantity;
	private String image;
}
