package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {

	@RequestMapping(value = "/demo")
	private String hello() {
		return "/index.html";
	}
}