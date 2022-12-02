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

	//글 작성 처리
	public void write(Board board) {
		boardRepository.save(board);
	}

	//게시판 리스트 처리
	public List<Board> getList() {
		return boardRepository.findAll();
	}

	//특정 게시글 불러오기
	public Board getBoard(Integer id) {
		return boardRepository.findById(id).get();
	}

	//특정 게시글 삭제하기
	public void delete(Integer id) {
		boardRepository.deleteById(id);
	}
}
