package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;



@Service
public class GameListService { //Chamar o repository que faz a busca no banco de dados

	@Autowired //Usando essa notação o propio spring vai resolver a dependencia a baixo
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll(); //vai buscar no banco de dados todos os games, que será convertida em uma lista.
		return result.stream().map(x -> new GameListDTO(x)).toList(); //Pegará o resultado acima e transformará nos campos da classe GameMinDTO
	}
}
