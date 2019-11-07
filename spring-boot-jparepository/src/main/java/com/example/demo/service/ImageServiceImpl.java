package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Image;
@Service
public class ImageServiceImpl implements ImageService {
	private ImageRepository imageRepository;

	public ImageServiceImpl(ImageRepository imageRepository) {
		super();
		this.imageRepository = imageRepository;
	}

	@Transactional
	@Override
	public List<Image> getAllImage() {
		
		return imageRepository.findAll();
	}

	@Transactional
	@Override
	public Optional<Image> getImageById(int theId) {
		
		return imageRepository.findById(theId);
	}

}
