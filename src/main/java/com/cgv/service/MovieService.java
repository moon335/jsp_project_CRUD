package com.cgv.service;

import java.util.ArrayList;

import com.cgv.dao.MovieDAO;
import com.cgv.dto.MovieDTO;

public class MovieService {
	
	private MovieDAO movieDAO;
	
	public MovieService() {
		movieDAO = new MovieDAO();
	}
	
	public ArrayList<MovieDTO> selectAll() {
		ArrayList<MovieDTO> list = movieDAO.select();
		return list;
	}
	
} // end of class
