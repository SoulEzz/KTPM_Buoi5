package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repo.ChuyenBayRepository;



@RestController
@RequestMapping("api")
public class PlaneController {
	
	@Autowired
	private ChuyenBayRepository bayRepository;
	
	
	
}
