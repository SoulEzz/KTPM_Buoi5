package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.ChuyenBay;

interface PlaneRepository extends JpaRepository<ChuyenBay, Long> {
	
}
