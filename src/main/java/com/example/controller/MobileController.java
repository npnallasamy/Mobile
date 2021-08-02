package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Mobile;
import com.example.service.MobileService;

@RestController
@RequestMapping("/Mobile")
public class MobileController {
	
	@Autowired
	private MobileService service;
	
	@GetMapping("/Lists")
	public String brandList(Model model) {
		
		List<Mobile> mobileList = service.MobileList();
		model.addAttribute("List",mobileList);
		return "index";
	}
	
	@GetMapping("/RestList")
	public List<Mobile> brandList() {
		
		List<Mobile> mobileList = service.MobileList();
		
		return mobileList;
	}


}
