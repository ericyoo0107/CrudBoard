package com.crud.crudBoard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

	@GetMapping("/board/write")
	public String boardController()
	{
		return "boardWrite";
	}
}