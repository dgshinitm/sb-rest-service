package com.intothemobile.itmadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping(path = {"/", "/index"})
	public String index(Model model) {
		model.addAttribute("name", "Index");
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "Donggill");
		return "hello";
	}
}
