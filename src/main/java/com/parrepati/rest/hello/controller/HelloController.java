package com.parrepati.rest.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@GetMapping(produces = "application/json")
	public String pintHello() {
		return "Hello World ...!";
	}
}
