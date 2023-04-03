package com.cgv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		ArrayList<TicketDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT t.id, t.date, t.startTime, u.username, th.city as city, th.name as theaterName, s.name as seatName, m.name as movieName, m.price as price, m.movieRated as movieRated, m.runningTime as runningTime "
				+ " FROM ticket as t "
				+ " INNER JOIN user as u "
				+ " ON t.userId = u.id "
				+ " INNER JOIN theater as th "
				+ " ON t.theaterId = th.id "
				+ " INNER JOIN movie as m "
				+ " ON t.movieId = m.id "
				+ " INNER JOIN seat as s "
				+ " ON t.seatId = s.id "
				+ " WHERE t.userId = ? ";
			
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				TicketDTO dto = new TicketDTO();
				int id = rs.getInt("id");
				String date = rs.getString("date");
				String startTime = rs.getString("startTime");
				String username = rs.getString("username");
				String city = rs.getString("city");
				String theaterName = rs.getString("theaterName");
				String seatName = rs.getString("seatName");
				String movieName = rs.getString("movieName");
				int price = rs.getInt("price");
				String movieRated = rs.getString("movieRated");
				String runningTime = rs.getString("runningTime");
				
				dto.setId(id);
				dto.setDate(date);
				dto.setStartTime(startTime);
				dto.setUsername(username);
				dto.setCity(city);
				dto.setTheaterName(theaterName);
				dto.setSeatName(seatName);
				dto.setMovieName(movieName);
				dto.setPrice(price);
				dto.setMovieRated(movieRated);
				dto.setRunningTime(runningTime);
				
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public TicketDTO selectOne(int userId, int seatId) {
		TicketDTO dto = new TicketDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT t.id, t.date, t.startTime, u.username, th.city as city, th.name as theaterName, s.name as seatName, m.name as movieName, m.price as price, m.movieRated as movieRated, m.runningTime as runningTime "
				+ " FROM ticket as t "
				+ " INNER JOIN user as u "
				+ " ON t.userId = u.id "
				+ " INNER JOIN theater as th "
				+ " ON t.theaterId = th.id "
				+ " INNER JOIN movie as m "
				+ " ON t.movieId = m.id "
				+ " INNER JOIN seat as s "
				+ " ON t.seatId = s.id "
				+ " WHERE t.userId = ? AND t.seatId = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, seatId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String date = rs.getString("date");
				String startTime = rs.getString("startTime");
				String username = rs.getString("username");
				String city = rs.getString("city");
				String theaterName = rs.getString("theaterName");
				String seatName = rs.getString("seatName");
				String movieName = rs.getString("movieName");
				int price = rs.getInt("price");
				String movieRated = rs.getString("movieRated");
				String runningTime = rs.getString("runningTime");
				
				dto.setId(id);
				dto.setDate(date);
				dto.setStartTime(startTime);
				dto.setUsername(username);
				dto.setCity(city);
				dto.setTheaterName(theaterName);
				dto.setSeatName(seatName);
				dto.setMovieName(movieName);
				dto.setPrice(price);
				dto.setMovieRated(movieRated);
				dto.setRunningTime(runningTime);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	@Override
	public int delete(int ticketId) {
		int resultRow = 0;
		PreparedStatement pstmt = null;
		String queryStr = " DELETE FROM ticket WHERE id = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, ticketId);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRow;
	}

	@Override
	public int insert(TicketDTO ticket) {
		int resultRow = 0;
		PreparedStatement pstmt = null;
		String queryStr = " INSERT INTO ticket(`date`, startTime, userId, theaterId, movieId, seatId) "
				+ " VALUES "
				+ "	(?, ?, ?, ?, ?, ?) ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, ticket.getDate());
			pstmt.setString(2, ticket.getStartTime());
			pstmt.setInt(3, ticket.getUserId());
			pstmt.setInt(4, ticket.getTheaterId());
			pstmt.setInt(5, ticket.getMovieId());
			pstmt.setInt(6, ticket.getSeatId());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRow;
	}

	@Override
	public TicketDTO selectOne(int ticketId) {
		TicketDTO dto = new TicketDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM ticket WHERE id = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, ticketId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String date = rs.getString("date");
				String startTime = rs.getString("startTime");
				int userId = rs.getInt("userId");
				int theaterId = rs.getInt("theaterId");
				int movieId = rs.getInt("movieId");
				int seatId = rs.getInt("seatId");
				
				dto.setId(id);
				dto.setDate(date);
				dto.setStartTime(startTime);
				dto.setUserId(userId);
				dto.setTheaterId(theaterId);
				dto.setMovieId(movieId);
				dto.setSeatId(seatId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

} // end of class
