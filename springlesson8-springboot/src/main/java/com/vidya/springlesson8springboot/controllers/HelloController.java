package com.vidya.springlesson8springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // restController combines @Controller and @ResponseBody. 
				// @ResponseBody hides the need to have a static page to view
public class HelloController {
	
	@RequestMapping("/hello")  //GET, POST
	public String hello() {
		return "Hello";
	}
}
