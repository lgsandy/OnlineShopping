package com.sandy.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OnlineShoppingProcessController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public String showHome(Map<String,Object>map) {
		map.put("title", "Home");
		map.put("userClickHome", true);
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


}
