package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Games;
import com.devsuperior.dslist.reposotories.GamesRepository;

@Service
public class GamesService {

	@Autowired
	private GamesRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Games> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
}
