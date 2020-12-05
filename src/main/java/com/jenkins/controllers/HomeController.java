package com.jenkins.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/{msg}")
	public String helloMethod(@PathVariable String pathVariable) {
		return "You have typed "+pathVariable;
	}
}
