package com.cgv.service;

import java.util.ArrayList;

import com.cgv.dao.MovieDAO;
import com.cgv.dao.TheaterDAO;
import com.cgv.dao.TicketDAO;
import com.cgv.dao.UserDAO;
import com.cgv.dao.seatDAO;
import com.cgv.dto.MovieDTO;
import com.cgv.dto.SeatDTO;
import com.cgv.dto.TheaterDTO;
import com.cgv.dto.TicketDTO;
import com.cgv.dto.UserDTO;

public class TicketService {
	
	private TicketDAO ticketDAO;
	private UserDAO userDAO;
	private seatDAO seatDAO;
	private TheaterDAO theaterDAO;
	private MovieDAO movieDAO;
	
	public TicketService() {
		ticketDAO = new TicketDAO();
		userDAO = new UserDAO();
		seatDAO = new seatDAO();
		theaterDAO = new TheaterDAO();
		movieDAO = new MovieDAO();
	}
	
	public ArrayList<TicketDTO> selectAllTicket(int userId) {
		ArrayList<TicketDTO> list = ticketDAO.selectByUserId(userId);
		return list;
	}
	
	public TicketDTO selectByTicketId(int TicketId) {
		TicketDTO resultDto = ticketDAO.selectByTicketId(TicketId);
		UserDTO user = userDAO.select(resultDto.getUserId());
		TheaterDTO theater = theaterDAO.select(resultDto.getTheaterId());
		SeatDTO seat = seatDAO.select(resultDto.getSeatId());
		MovieDTO movie = movieDAO.select(resultDto.getMovieId());
		
		String username = user.getUsername();
		String city = theater.getCity();
		String theaterName = theater.getName();
		String seatName = seat.getName();
		String movieName = movie.getName();
		int price = movie.getPrice();
		String movieRated = movie.getMovieRated();
		
		resultDto.setUsername(username);
		resultDto.setCity(city);
		resultDto.setTheaterName(theaterName);
		resultDto.setSeatName(seatName);
		resultDto.setMovieName(movieName);
		resultDto.setPrice(price);
		resultDto.setMovieRated(movieRated);
		
		return resultDto;
	}
	
} // end of class
