package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ESProduct;
import com.example.demo.domain.Product;
import com.example.demo.service.InventoryService;

@RestController
@RequestMapping("/api/v1/inventory/")
public class InventoryController {

	@Autowired
	InventoryService inventoryService;
	
	
	 @GetMapping(value="group-by")
	    public ESProduct searchByName(@RequestParam(value ="name") String name){
		
		return inventoryService.viewProducts(name);
	}
	
	@PostMapping
	public List<Product> saveProducts(){
		
		
		List<Product> list=new ArrayList<Product>();
		
		list.add(new Product(0, "xyz","Electronics","50000", "5","/img.tv/1234"));
		list.add(new Product (0,"wathch","Electronics","6000", "15","/img.tv/1234"));
		list.add(new Product(0, "TV","Electronics","50000", "54","/img.tv/1234"));
		
		return inventoryService.saveProducts(list);
	}
}
