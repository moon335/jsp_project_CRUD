package com.cgv.service;

import java.util.ArrayList;

import com.cgv.dao.SeatDAO;
import com.cgv.dto.SeatDTO;

public class SeatService {
	
	private SeatDAO seatDAO;
	
	public SeatService() {
		seatDAO = new SeatDAO();
	}
	
	public ArrayList<SeatDTO> selectAll(int movieId) {
		ArrayList<SeatDTO> list = seatDAO.select(movieId);
		return list;
	}
	
	public SeatDTO selectByName(String name, int movieId) {
		SeatDTO resultDTO = seatDAO.select(name, movieId);
		return resultDTO;
	}
	
	public int soldOutSeat(String name, int movieId) {
		int resultRow = 0;
		resultRow = seatDAO.update(name, movieId);
		return resultRow;
	}
	
} // end of class
