package com.cgv.service;

import java.util.ArrayList;


import com.cgv.dao.MovieDAO;
import com.cgv.dao.TheaterDAO;
import com.cgv.dao.TicketDAO;
import com.cgv.dao.UserDAO;
import com.cgv.dao.SeatDAO;
import com.cgv.dto.TicketDTO;

public class TicketService {
	
	private TicketDAO ticketDAO;
	private UserDAO userDAO;
	private TheaterDAO theaterDAO;
	private MovieDAO movieDAO;
	private SeatDAO seatDAO;
	
	public TicketService() {
		ticketDAO = new TicketDAO();
		userDAO = new UserDAO();
		theaterDAO = new TheaterDAO();
		movieDAO = new MovieDAO();
		seatDAO = new SeatDAO();
	}
	
	public ArrayList<TicketDTO> selectAllTicket(String userId) {
		int targetId = userDAO.select(userId).getId();
		ArrayList<TicketDTO> list = ticketDAO.selectByUserId(targetId);
		return list;
	}
	
	public TicketDTO selectOne(int userId, int seatId) {
		TicketDTO resultDto = ticketDAO.selectOne(userId, seatId);
		return resultDto;
	}
	
	public TicketDTO insertTicket(String targetUserId, String movie, String theater, String date, String startTime, String seat) {
		int userId = userDAO.select(targetUserId).getId();
		int movieId = movieDAO.select(movie).getId();
		int theaterId = theaterDAO.select(theater).getId();
		int seatId = seatDAO.select(seat, movieId).getId();
		TicketDTO dto = new TicketDTO();
		dto.setUserId(userId);
		dto.setMovieId(movieId);
		dto.setTheaterId(theaterId);
		dto.setSeatId(seatId);
		dto.setDate(date);
		dto.setStartTime(startTime);
		ticketDAO.insert(dto);
		seatDAO.update(seat, movieId);
		TicketDTO resultDto = selectOne(userId, seatId);
		
		return resultDto;
	}
	
	public int deleteTicket(int ticketId) {
		int seatId = ticketDAO.selectOne(ticketId).getSeatId();
		seatDAO.update(seatId);
		int resultRow = ticketDAO.delete(ticketId);
		return resultRow;
	}
	
} // end of class
