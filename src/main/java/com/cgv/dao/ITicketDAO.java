package com.cgv.dao;

import java.util.ArrayList;

import com.cgv.dto.TicketDTO;

public interface ITicketDAO {
	
	ArrayList<TicketDTO> selectByUserId(int userId);
	TicketDTO selectByTicketId(int ticketId);
	int update(int ticketId);
	int delete(int ticketId);
	
}
