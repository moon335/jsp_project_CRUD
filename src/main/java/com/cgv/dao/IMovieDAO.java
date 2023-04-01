package com.cgv.dao;

import java.util.ArrayList;

import com.cgv.dto.MovieDTO;

public interface IMovieDAO {
	
	ArrayList<MovieDTO> select();
	MovieDTO select(String name);
	
} 
