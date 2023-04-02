package com.cgv.dao;

import java.util.ArrayList;

import com.cgv.dto.SeatDTO;

public interface ISeatDAO {
	
	ArrayList<SeatDTO> select();
	SeatDTO select(String name);
	SeatDTO select(int targetId);
	int update(int id);
	
} // end of class
