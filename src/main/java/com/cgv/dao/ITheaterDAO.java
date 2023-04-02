package com.cgv.dao;

import java.util.ArrayList;

import com.cgv.dto.TheaterDTO;

public interface ITheaterDAO {
	
	ArrayList<TheaterDTO> select();
	TheaterDTO select(String name);
	TheaterDTO select(int targetId);
	
}
