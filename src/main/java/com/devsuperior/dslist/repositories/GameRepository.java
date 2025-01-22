package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{ //Consultar, inserir, editar, deletar no banco de dados usando o JpaRepository

}
