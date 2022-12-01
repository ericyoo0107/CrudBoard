package com.crud.crudBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.crudBoard.entity.Board;
import com.crud.crudBoard.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping("/board/write")
	public String boardWriteForm() {
		return "boardWrite";
	}

	@PostMapping("/board/getData")
	public String boardGetData(Board board) {
		boardService.write(board);
		return "";
	}

	@GetMapping("/board/list")
	public String boardList(Model model) {
		model.addAttribute("list", boardService.getList());
		return "boardList";
	}
}
