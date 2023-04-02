package com.cgv.dao;

import com.cgv.dto.UserDTO;

public interface IUserDAO {
	
	UserDTO select(String userId);
	UserDTO select(String userId, String password);
	UserDTO select(int targetId);
	int insert(UserDTO dto);
	int update(String userId, String password, String tel, String email);
	int delete(String userId, String password);
	
}
