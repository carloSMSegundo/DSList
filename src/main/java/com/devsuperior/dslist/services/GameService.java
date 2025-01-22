package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService { //Chamar o repository que faz a busca no banco de dados

	@Autowired //Usando essa notação o propio spring vai resolver a dependencia a baixo
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll(); //vai buscar no banco de dados todos os games, que será convertida em uma lista.
		return result.stream().map(x -> new GameMinDTO(x)).toList();

	}
}
