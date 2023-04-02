package com.cgv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cgv.dto.MovieDTO;
import com.cgv.utils.DBHelper;

public class MovieDAO implements IMovieDAO{
	
	private Connection conn;
	
	public MovieDAO() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public ArrayList<MovieDTO> select() {
		ArrayList<MovieDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM movie ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String movieRated = rs.getString("movieRated");
				
				MovieDTO dto = new MovieDTO(id, name, price, movieRated);
				
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
	public MovieDTO select(String targetName) {
		MovieDTO dto = new MovieDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM movie WHERE name = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, targetName);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String movieRated = rs.getString("movieRated");
				
				dto.setId(id);
				dto.setName(name);
				dto.setPrice(price);
				dto.setMovieRated(movieRated);
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
	public MovieDTO select(int targetId) {
		MovieDTO dto = new MovieDTO();
		String queryStr = " SELECT * FROM movie WHERE id = ? ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, targetId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String movieRated = rs.getString("movieRated");
				
				dto.setId(id);
				dto.setName(name);
				dto.setPrice(price);
				dto.setMovieRated(movieRated);
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

} // end of class
