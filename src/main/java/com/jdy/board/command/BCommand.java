package com.jdy.board.command;

import org.springframework.ui.Model;

public interface BCommand {
	public void execute(Model model); // 추상메소드 선언
}
