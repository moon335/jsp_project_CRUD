package com.cgv.service;

import java.util.ArrayList;

import com.cgv.dao.TheaterDAO;
import com.cgv.dto.TheaterDTO;

public class TheaterService {
	
	private TheaterDAO theaterDAO;
	
	public TheaterService() {
		theaterDAO = new TheaterDAO();
	}
	
	public ArrayList<TheaterDTO> selectAll() {
		ArrayList<TheaterDTO> list = theaterDAO.select();
		return list;
	}
	
} // end of class
