package com.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ChuyenBay;
import com.example.repo.ChuyenBayRepository;
import com.example.services.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	
	
	@Autowired
	private ChuyenBayRepository chuyenbayRepository;

	@Override
	public List<ChuyenBay> getAllChuyenBay() {
		
		List<ChuyenBay> list = chuyenbayRepository.findAll();
		
		return list;
		
	}
	
	
	
	
}
