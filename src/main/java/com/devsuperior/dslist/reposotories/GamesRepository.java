package com.devsuperior.dslist.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Games;

public interface GamesRepository extends JpaRepository<Games , Long> {

}
