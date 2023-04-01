package com.cgv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cgv.dto.UserDTO;
import com.cgv.utils.DBHelper;

public class UserDAO implements IUserDAO{
	
	private Connection conn;
	
	public UserDAO() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public UserDTO selectByUserId(String targetUserId) {
		UserDTO dto = new UserDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String queryStr = " SELECT * FROM user WHERE userId = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, targetUserId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String userId = rs.getString("userId");
				String password = rs.getString("password");
				String username = rs.getString("username");
				String birthDate = rs.getString("birthDate");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				
				dto.setId(id);
				dto.setUserId(userId);
				dto.setPassword(password);
				dto.setUsername(username);
				dto.setBirthDate(birthDate);
				dto.setTel(tel);
				dto.setEmail(email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(UserDTO dto) {
		int resultRow = 0;
		String queryStr = " INSERT INTO user(userId, password, username, birthDate, tel, email) "
				+ " VALUES "
				+ "	(?, ?, ?, ?, ?, ?) ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, dto.getUserId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getUsername());
			pstmt.setString(4, dto.getBirthDate());
			pstmt.setString(5, dto.getTel());
			pstmt.setString(6, dto.getEmail());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public UserDTO selectIdNPw(String targetUserId, String targetPw) {
		UserDTO dto = new UserDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String queryStr = " SELECT * FROM user WHERE userId = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, targetUserId);
			pstmt.setString(2, targetPw);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String userId = rs.getString("userId");
				String password = rs.getString("password");
				String username = rs.getString("username");
				String birthDate = rs.getString("birthDate");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				
				dto.setId(id);
				dto.setUserId(userId);
				dto.setPassword(password);
				dto.setUsername(username);
				dto.setBirthDate(birthDate);
				dto.setTel(tel);
				dto.setEmail(email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int update(String userId, String password, String tel, String email) {
		int resultRow = 0;
		PreparedStatement pstmt = null;
		String queryStr = " UPDATE user "
				+ " SET password = ?, tel = ?, email = ? "
				+ " WHERE userId = ? ";
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, password);
			pstmt.setString(2, tel);
			pstmt.setString(3, email);
			pstmt.setString(4, userId);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public int delete(String userId, String password) {
		int resultRow = 0;
		String queryStr = " DELETE FROM user WHERE userId = ? AND password = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}

} // end of class
