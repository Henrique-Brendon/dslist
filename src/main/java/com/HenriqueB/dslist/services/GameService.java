package com.HenriqueB.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.HenriqueB.dslist.dto.GameDTO;
import com.HenriqueB.dslist.dto.GameMinDTO;
import com.HenriqueB.dslist.entities.Game;
import com.HenriqueB.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly =  true)
	public GameDTO finById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		
		}
	@Transactional(readOnly =  true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
		
	}

}
