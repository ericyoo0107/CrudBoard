package com.crud.crudBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crudBoard.entity.Board;
import com.crud.crudBoard.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;

	public void write(Board board) {
		boardRepository.save(board);
	}

	public List<Board> getList() {
		return boardRepository.findAll();
	}
}
