package com.cgv.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cgv.dto.SeatDTO;
import com.cgv.utils.DBHelper;

public class SeatDAO implements ISeatDAO{
	
	private Connection conn;
	
	public SeatDAO() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public ArrayList<SeatDTO> select(int targetMovieId) {
		ArrayList<SeatDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM seat WHERE isChecked = 1 AND movieId = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, targetMovieId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int isChecked = rs.getInt("isChecked");
				int subSection = rs.getInt("subSection");
				int movieId = rs.getInt("movieId");
				
				SeatDTO dto = new SeatDTO(id, name, isChecked, subSection, movieId);
				
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
	public SeatDTO select(String targetName, int targetId) {
		SeatDTO dto = new SeatDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM seat WHERE name = ? AND movieId = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, targetName);
			pstmt.setInt(2, targetId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int isChecked = rs.getInt("isChecked");
				int subSection = rs.getInt("subSection");
				int movieId = rs.getInt("movieId");
				dto.setId(id);
				dto.setName(name);
				dto.setChecked(isChecked);
				dto.setSubSection(subSection);
				dto.setMovieId(movieId);
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
	public int update(String name, int movieId) {
		int resultRow = 0;
		String queryStr = " UPDATE seat "
				+ "set isChecked = 0 "
				+ "WHERE movieId = ? AND name = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, movieId);
			pstmt.setString(2, name);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public SeatDTO selectById(int targetId) {
		SeatDTO dto = new SeatDTO();
		String queryStr = " SELECT * FROM seat WHERE id = ? ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, targetId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int isChecked = rs.getInt("isChecked");
				int subSection = rs.getInt("subSection");
				int movieId = rs.getInt("movieId");
				
				dto.setId(id);
				dto.setName(name);
				dto.setChecked(isChecked);
				dto.setSubSection(subSection);
				dto.setMovieId(movieId);
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
	public int update(int seatId) {
		int resultRow = 0;
		String queryStr = " UPDATE seat "
				+ " set isChecked = 1 "
				+ " WHERE id = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, seatId);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}
	
} // end of class
