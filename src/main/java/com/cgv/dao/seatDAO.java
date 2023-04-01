package com.cgv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		ArrayList<SeatDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM seat WHERE isChecked = 1 ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int isChecked = rs.getInt("isChecked");
				
				SeatDTO dto = new SeatDTO(id, name, isChecked);
				
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
	public SeatDTO select(String targetName) {
		SeatDTO dto = new SeatDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String queryStr = " SELECT * FROM seat WHERE name = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, targetName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int isChecked = rs.getInt("isChecked");
				dto.setId(id);
				dto.setName(name);
				dto.setChecked(isChecked);
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
	public int update(int id) {
		int resultRow = 0;
		String queryStr = " UPDATE seat "
				+ " set isChecked = 0 "
				+ " WHERE id = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}
	
} // end of class
