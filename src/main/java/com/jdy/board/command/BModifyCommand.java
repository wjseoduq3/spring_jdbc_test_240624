package com.jdy.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jdy.board.dao.BoardDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request =(HttpServletRequest) map.get("request");
		
		String bnum = request.getParameter("bnum");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
			
		BoardDao boardDao = new BoardDao();
		boardDao.modify(bnum, btitle, bcontent);

	}

}
