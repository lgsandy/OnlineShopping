package com.sandy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sandy.dto.CatatgoriesDTO;
import com.sandy.service.CatagoriesService;

@Controller
public class OnlineShoppingProcessController {
	@Autowired()
	private CatagoriesService service;
	
	@RequestMapping(value= {"/","/home","/index"})
	public String showHome(Map<String,Object>map) {
		map.put("title", "Home");
		map.put("userClickHome", true);
		//call service class method to get catagories list
		map.put("catagories", service.getCatList());
		return "home";
	}
	
	@RequestMapping(value= {"/contactUs"})
	public String contactUs(Map<String,Object>map) {
		map.put("title", "ContactUs");
		map.put("userClickContact", true);
		return "home";
	}
	
	@RequestMapping(value= {"/aboutUs"})
	public String aboutUs(Map<String,Object>map) {
		map.put("title", "AboutUs");
		map.put("userClickAboutUs", true);
		return "home";
	}
	
	/*
	 * Method to load all the products and based on category
	 * */
	@RequestMapping(value= "/show/all/products")
	public String showAllProducts(Map<String,Object>map) {
		map.put("title", "All Products");
		map.put("userClickAllproducts", true);
		//call service class method to get catagories list
		map.put("catagories", service.getCatList());
		return "home";
	}
	@RequestMapping(value= "/show/cat/{id}/products")
	public String showCategoryProducts(Map<String,Object>map,@PathVariable("id") int id) {
		CatatgoriesDTO catDTO=null;
		//get categoey by id by calling service class method
		catDTO=service.getCategoriesByID(id);
		
		map.put("title", catDTO.getName());
		map.put("userClickCategoryProducts", true);
		//call service class method to get catagories list
		map.put("catagories", service.getCatList());
		//add CatagoriesByID in map Attribute
		map.put("category", catDTO);
		return "home";
	}


}
