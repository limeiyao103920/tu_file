package com.maven.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Zuoye {

	@RequestMapping("list")
	public String list() {
		
		return "list";
	}
	
	
	
}
