package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.entity.Album;
@Service
public class AlbumServiceImpl implements AlbumService {
	private AlbumRepository albumRepository; 

	@Override
	@Transactional
	public List<Album> getAllAlbum() {
		
		return albumRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Album> getAlbumById(int theId) {
		
		return albumRepository.findById(theId);
	}

	public AlbumServiceImpl(AlbumRepository albumRepository) {
		super();
		this.albumRepository = albumRepository;
	}

}
