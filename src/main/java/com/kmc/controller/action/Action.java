package com.kmc.controller.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public interface Action {
	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws SerialException, IOException;
}
