package com.crud.crudBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crudBoard.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
