package com.gitdeploy.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitDeployController {
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello "+name;
	}
}
