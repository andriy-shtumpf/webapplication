package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello(Model theModel) {
		
		theModel.addAttribute("theDate", new java.util.Date());
		
		//	as we have thymeleaf dependency spring automatically
		//	look for a page "helloworld.html"
		
		return "helloworld";
	}

}
