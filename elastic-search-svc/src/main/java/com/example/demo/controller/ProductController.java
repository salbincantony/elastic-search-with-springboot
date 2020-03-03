package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.document.Product;
import com.example.demo.document.ProfileDocument;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/v1/products/" )
public class ProductController {

	@Autowired
	ProductService productService;

	
    @GetMapping(value="group-by")
    public List<Product> searchByName(@RequestParam(value ="name") String name) throws Exception {
       
    	return productService.findProductByName(name);
   
    }

}
