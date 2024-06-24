package com.jdy.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdy.board.command.BCommand;
import com.jdy.board.command.BContentViewCommand;
import com.jdy.board.command.BListCommand;
import com.jdy.board.command.BWriteCommand;
import com.jdy.board.util.Constant;

@Controller
public class BoardController {
	
	BCommand command = null;
	
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@RequestMapping(value = "/write")
	public String write() {		
		return "write_form";	
	}
	
	@RequestMapping(value = "/writeOk")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";	
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";		
	}
	
	@RequestMapping(value = "/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("requset", request);
		
		command = new BContentViewCommand();
		command.execute(model);
		
		return "content_view";		
	}
		
}
