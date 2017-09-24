package com.sandy.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OnlineShoppingProcessController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public String showHome(Map<String,Object>map) {
		map.put("msg", "Welcome to mvc application");
		return "home";
	}

}
