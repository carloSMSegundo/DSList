package com.devsuperior.dslist.repositories; //Componente de acesso a dados

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{ //Consultar, inserir, editar, deletar no banco de dados usando o JpaRepository

}
