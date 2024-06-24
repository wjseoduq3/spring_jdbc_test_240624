package com.jdy.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.jdy.board.dao.BoardDao;
import com.jdy.board.dto.BoardDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		BoardDao boardDao = new BoardDao();
		ArrayList<BoardDto> boardDtos = boardDao.list();
		
		model.addAttribute("boardList", boardDtos);			
	}
}
