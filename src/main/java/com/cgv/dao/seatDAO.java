package com.cgv.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.cgv.dto.SeatDTO;
import com.cgv.utils.DBHelper;

public class seatDAO implements ISeatDAO{
	
	private Connection conn;
	
	public seatDAO() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public ArrayList<SeatDTO> select() {
		return null;
	}

	@Override
	public SeatDTO select(String name) {
		return null;
	}

	@Override
	public int update() {
		return 0;
	}
	
} // end of class
