package com.cgv.dao;

import java.util.ArrayList;

import com.cgv.dto.TicketDTO;

public interface ITicketDAO {
	
	ArrayList<TicketDTO> selectByUserId(int userId);
	TicketDTO selectOne(int userId, int seatId);
	TicketDTO selectOne(int ticketId);
	int insert(TicketDTO ticket);
	int delete(int ticketId);
	
}
