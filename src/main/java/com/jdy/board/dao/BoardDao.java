package com.jdy.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.jdy.board.dto.BoardDto;
import com.jdy.board.util.Constant;

public class BoardDao {

	DataSource dataSource;
	JdbcTemplate template;
	
	public BoardDao() {		
		this.template = Constant.template;		
	}
	
	public void writeOk(final String bname, final String btitle, final String bcontent) {
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "INSERT INTO springboard(bname,btitle, bcontent, bhit) VALUES(?,?,?,0)";
				
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, bname);
				pstmt.setString(2, btitle);
				pstmt.setString(3, bcontent);
				
				return pstmt;
			}
		});	
	}
	
	public ArrayList<BoardDto> list() {
		String sql = "SELECT * FROM springboard ORDER BY bnum DESC";
		
		ArrayList<BoardDto> boardDtos = (ArrayList<BoardDto>) this.template.query(sql, new BeanPropertyRowMapper(BoardDto.class));
		
		return boardDtos;	
	}
	
	public BoardDto content_view(String boardNum) {
		
		String sql = "SELECT * FROM springboard WHERE bnum=" + boardNum;
		
		BoardDto boardDto = this.template.queryForObject(sql, new BeanPropertyRowMapper(BoardDto.class));
		
		return boardDto;	
	}
	
	public void modify(final String bnum, final String btitle, final String bcontent) {
		
		String sql ="UPDATE springboard SET btitle=?, bcontent=? WHERE bnum=?";
		
		this.template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, btitle);
				ps.setString(2, bcontent);
				ps.setString(3, bnum);				
			}			
		});

	}
	
 	
	
	
	
}
