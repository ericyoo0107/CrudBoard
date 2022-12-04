package com.crud.crudBoard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crudBoard.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
	//명명 규칙 findBy(Title)Containing title = 컬럼이름 하면 알아서 searchKey 넣으면 찾아줌
	Page<Board> findByTitleContaining(String searchKey,Pageable pageable);
}
