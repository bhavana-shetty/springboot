package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Album;

import com.example.demo.service.AlbumService;

@RestController
public class AlbumController {
	
	private AlbumService albumService;

	public AlbumController(AlbumService albumService) {
		super();
		this.albumService = albumService;
	}
	
	@GetMapping("/albums")
	public List<Album> list(){
		return albumService.getAllAlbum();
	}


}
