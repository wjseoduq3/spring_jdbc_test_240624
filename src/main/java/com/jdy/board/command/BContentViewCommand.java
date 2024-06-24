package com.jdy.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jdy.board.dao.BoardDao;
import com.jdy.board.dto.BoardDto;

public class BContentViewCommand implements BCommand{
	
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request =(HttpServletRequest) map.get("request");
		
		String bnum = request.getParameter("bnum");
			
		BoardDao boardDao = new BoardDao();
		BoardDto boardDto = boardDao.content_view(bnum);
		
		model.addAttribute("boardDto", boardDto);
		
	}
	
	
}
