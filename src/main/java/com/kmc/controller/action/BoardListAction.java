package com.kmc.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.kmc.dao.BoardDAO;
import com.kmc.dto.BoardVO;

public class BoardListAction implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws SerialException, IOException{
		String url = "/board/boardList.jsp";
		
		BoardDAO bDao=BoardDAO.getInstance();
		
		List<BoardVO> boardList = bDao.selectAllBoards();
		
		request.setAttribute("boardList", boardList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
