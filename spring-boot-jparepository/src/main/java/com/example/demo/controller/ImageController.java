package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Image;
import com.example.demo.service.ImageService;

@RestController
public class ImageController {
	private ImageService imageService;

	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@GetMapping("/images")
	public List<Image> list(){
		return imageService.getAllImage();
	}
	
	

}
