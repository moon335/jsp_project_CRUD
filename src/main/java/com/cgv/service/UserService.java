package com.cgv.service;

import com.cgv.dao.UserDAO;
import com.cgv.dto.UserDTO;

public class UserService {
	
	private UserDAO dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	
	public UserDTO loginCheck(String userId, String password) {
		UserDTO resultDto = dao.selectIdNPw(userId, password);
		return resultDto;
	}
	
	public UserDTO selectByUserId(String userId) {
		UserDTO resultDto = dao.selectByUserId(userId);
		return resultDto;
	}
	
	public int signUp(String username, String userId, String password, String birthDate, String tel, String email) {
		int resultRow = 0;
		resultRow = dao.insert(username, userId, password, birthDate, tel, email);
		return resultRow;
	}
	
	public int updateInfo(String userId, String password, String tel, String email) {
		int resultRow = 0;
		resultRow = dao.update(userId, password, tel, email);
		return resultRow;
	}
	
	public int deleteInfo(String userId, String password) {
		int resultRow = 0;
		resultRow = dao.delete(userId, password);
		return resultRow;
	}
	
}
