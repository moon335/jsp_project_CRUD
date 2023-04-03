package com.cgv.dao;

import java.util.ArrayList;

import com.cgv.dto.SeatDTO;

public interface ISeatDAO {
	
	ArrayList<SeatDTO> select(int movieId);
	SeatDTO select(String targetName, int movieId);
	SeatDTO selectById(int targetId);
	int update(String name, int movieId);
	int update(int seatId);
	
} // end of class
