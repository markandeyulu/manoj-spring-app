package com.amazon.app.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//Back Controller
@RestController()
@RequestMapping("/product") //If URI's are unique you dont need identifier. this is just example identifier
public class ProductController2 {
 
	@GetMapping(value = "/getproduct2") // same way we have postmapping and rest. latest usage
	public String getMessage() {
		return "Welcome Rest controller" ;
	}
	
	@GetMapping(value = "/getproduct3") // same way we have postmapping and rest. latest usage
	public String getMessage2(@RequestParam String id, @RequestParam String id2) {
		return "Welcome Rest controller : " + id + id2;
	}
	 
}
