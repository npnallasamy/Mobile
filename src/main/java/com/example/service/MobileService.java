package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Mobile;
import com.example.repo.mobileRepo;

@Service
public class MobileService {
	
	@Autowired
	private mobileRepo repo;
	
	public List<Mobile> MobileList(){
		
		List<Mobile> findAll = repo.findAll();
		System.out.println(findAll);
		
		return findAll;
		
	}

}
