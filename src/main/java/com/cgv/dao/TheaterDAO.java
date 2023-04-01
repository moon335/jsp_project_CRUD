package com.cgv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cgv.dto.TheaterDTO;
import com.cgv.utils.DBHelper;

public class TheaterDAO implements ITheaterDAO{
	
	private Connection conn;
	
	public TheaterDAO() {
		conn = DBHelper.getInstance().getConnection();
	}

	@Override
	public ArrayList<TheaterDTO> select() {
		ArrayList<TheaterDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM theater ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String city = rs.getString("city");
				String name = rs.getString("name");
				
				TheaterDTO dto = new TheaterDTO(id, city, name);
				
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
	public TheaterDTO select(String targetName) {
		TheaterDTO dto = new TheaterDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM theater WHERE name = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, targetName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String city = rs.getString("city");
				String name = rs.getString("name");
				
				dto.setId(id);
				dto.setCity(city);
				dto.setName(name);
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
