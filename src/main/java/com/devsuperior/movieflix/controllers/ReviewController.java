package com.devsuperior.movieflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.services.ReviewService;

@RestController
@RequestMapping(value="reviews")
public class ReviewController {
	
	@Autowired
	private ReviewService service;
	
	public ResponseEntity<ReviewDTO> findById(Long id) {
		
		ReviewDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

}
