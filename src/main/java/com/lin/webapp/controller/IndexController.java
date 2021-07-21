package com.lin.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main.html";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login.html";
	}
}
