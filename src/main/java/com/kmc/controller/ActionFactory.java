package com.kmc.controller;

import com.kmc.controller.action.Action;
import com.kmc.controller.action.BoardCheckPassAction;
import com.kmc.controller.action.BoardCheckPassFormAction;
import com.kmc.controller.action.BoardDeleteAction;
import com.kmc.controller.action.BoardListAction;
import com.kmc.controller.action.BoardUpdateAction;
import com.kmc.controller.action.BoardUpdateFormAction;
import com.kmc.controller.action.BoardViewAction;
import com.kmc.controller.action.BoardWriteAction;
import com.kmc.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :"+command);
		/*추가된 부분*/
		if(command.equals("board_list")) {
			action = new BoardListAction();
		} else if(command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		} else if(command.equals("board_write")) {
			action = new BoardWriteAction();
		} else if(command.equals("board_view")) {
			action = new BoardViewAction();
		} else if(command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		} else if(command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
		} else if(command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		} else if(command.equals("board_update")) {
			action = new BoardUpdateAction();
		} else if(command.equals("board_delete")) {
			action = new BoardDeleteAction();
		}
		return action;
	}
}
