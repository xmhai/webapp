package com.lin.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	@GetMapping("/about")
	public String about() {
		return "home/about.html";
	}

	@GetMapping("/contact")
	public String contact() {
		return "home/contact.html";
	}

	@GetMapping("/feedback")
	public String feedback() {
		return "home/feedback.html";
	}

	@GetMapping("/faq")
	public String faq() {
		return "home/faq.html";
	}
}
