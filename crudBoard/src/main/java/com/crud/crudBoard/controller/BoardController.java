package com.crud.crudBoard.controller;

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

	@GetMapping("/board/list") //html로 다시 넘겨 줄때는 Model 적어야함
	public String boardList(Model model) {
		model.addAttribute("list", boardService.getList());
		return "boardList";
	}

	@GetMapping("/board/view") ///board/view?id=3 하면 id에 3들어감
	public String boardView(Model model, Integer id) {
		model.addAttribute("article", boardService.getBoard(id));
		return "boardView";
	}

	@GetMapping("/board/delete") ///board/delete?id=3 하면 id에 3들어감
	public String boardDelete(Integer id) {
		boardService.delete(id);
		return "redirect:/board/list";
	}
}
