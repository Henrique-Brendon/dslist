package com.HenriqueB.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HenriqueB.dslist.dto.GameMinDTO;
import com.HenriqueB.dslist.entities.Game;
import com.HenriqueB.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findall(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}
}