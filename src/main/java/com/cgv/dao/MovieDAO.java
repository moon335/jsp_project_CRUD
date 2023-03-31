package com.cgv.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.cgv.utils.DBHelper;

public class MovieDAO implements IMovieDAO{
	
	Connection conn;
	
	public MovieDAO() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public ArrayList<MovieDAO> select() {
		return null;
	}

	@Override
	public MovieDAO select(String name) {
		return null;
	}

}
