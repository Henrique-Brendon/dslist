package com.HenriqueB.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HenriqueB.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{


	
}
