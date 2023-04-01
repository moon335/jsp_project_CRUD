package com.cgv.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.cgv.dto.TicketDTO;
import com.cgv.utils.DBHelper;

public class TicketDAO implements ITicketDAO{
	
	private Connection conn;
	
	public TicketDAO() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public ArrayList<TicketDTO> selectByUserId(int userId) {

		return null;
	}

	@Override
	public TicketDTO selectByTicketId(int ticketId) {

		return null;
	}

	@Override
	public int update(int ticketId) {

		return 0;
	}

	@Override
	public int delete(int ticketId) {

		return 0;
	}

} // end of class
