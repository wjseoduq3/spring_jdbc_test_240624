package com.jdy.board.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdy.board.util.Constant;

public class BoardDao {

	DataSource dataSource;
	JdbcTemplate template;
	public BoardDao() {
		
		this.template = Constant.template;
		
	}
	
	
	
	
}
