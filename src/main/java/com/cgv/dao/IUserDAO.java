package com.cgv.dao;

import com.cgv.dto.UserDTO;

public interface IUserDAO {
	
	UserDTO selectByUserId(String userId);
	UserDTO selectIdNPw(String userId, String password);
	int insert(String username, String userId, String password, String birthDate, String tel, String email);
	int update(String userId, String password, String tel, String email);
	int delete(String userId, String password);
	
}
