package com.maven.web.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class Zuoye {

	@RequestMapping("admin")
	
	public String list() {
		
		return "list";
	}
	
	@RequestMapping("add")
	
	public String add(Model model,MultipartFile file) {
		if(!file.isEmpty()) {
		String path="e:/pic/";
		String filename = file.getOriginalFilename();
		File file2=new File(path,filename);
		model.addAttribute("filename",filename);
			try {
				file.transferTo(file2);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
		}
		
		return "success";
	}
	
	
}
