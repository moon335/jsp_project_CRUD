package com.cgv.service;

import java.util.ArrayList;

import com.cgv.dao.seatDAO;
import com.cgv.dto.SeatDTO;

public class SeatService {
	
	private seatDAO seatDAO;
	
	public SeatService() {
		seatDAO = new seatDAO();
	}
	
	public ArrayList<SeatDTO> selectAll() {
		ArrayList<SeatDTO> list = seatDAO.select();
		return list;
	}
	
} // end of class
