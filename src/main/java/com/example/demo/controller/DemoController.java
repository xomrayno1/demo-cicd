package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	private static final Logger log = LoggerFactory.getLogger(DemoController.class);
 
	@GetMapping("/demo")
	public List<String> getValue(){
		log.info("show error");
		return Arrays.asList("Demo");
	}

}
