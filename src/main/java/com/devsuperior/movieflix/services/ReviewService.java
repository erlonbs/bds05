package com.devsuperior.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository repository;
	
	@Transactional(readOnly = true)
	public ReviewDTO findById(Long id) {
		
		Optional<Review> review = repository.findById(id);
		ReviewDTO dto = new ReviewDTO(review.get());
		return dto;
		
	}
}
