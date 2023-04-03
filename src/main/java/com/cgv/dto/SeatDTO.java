package com.cgv.dto;

public class SeatDTO {
	
	private int id;
	private String name;
	private int isChecked;
	private int subSection;
	private int movieId;
	
	public SeatDTO() {
	}

	public SeatDTO(int id, String name, int isChecked, int subSection, int movieId) {
		this.id = id;
		this.name = name;
		this.isChecked = isChecked;
		this.subSection = subSection;
		this.movieId = movieId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIsChecked() {
		return isChecked;
	}

	public void setChecked(int isChecked) {
		this.isChecked = isChecked;
	}

	public int getSubSection() {
		return subSection;
	}

	public void setSubSection(int subSection) {
		this.subSection = subSection;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "SeatDTO [id=" + id + ", name=" + name + ", isChecked=" + isChecked + ", subSection=" + subSection + "]";
	}
	
} // end of class
