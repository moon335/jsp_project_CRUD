package com.cgv.dao;

import java.util.ArrayList;

public interface IMovieDAO {
	
	ArrayList<MovieDAO> select();
	MovieDAO select(String name);
	
} 
