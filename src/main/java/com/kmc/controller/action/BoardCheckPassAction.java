package com.kmc.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.kmc.dao.BoardDAO;
import com.kmc.dto.BoardVO;

public class BoardCheckPassAction implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws SerialException, IOException{
		String url = null;
		
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		
		BoardDAO bDao = BoardDAO.getInstance();
		BoardVO bVo = bDao.selectOneBoardByNum(num);
		
		if(bVo.getPass().equals(pass)) {//성공
			url = "/board/checkSuccess.jsp";
		}else {//실패
			url = "/board/boardCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀립니다.");
		}
		
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
