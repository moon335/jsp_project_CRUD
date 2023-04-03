package com.cgv.dto;

public class MovieDTO {
	
	private int id;
	private String name;
	private int price;
	private String movieRated;
	private String runningTime;
	
	public MovieDTO() {
	}
	
	public MovieDTO(int id, String name, int price, String movieRated, String runningTime) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.movieRated = movieRated;
		this.runningTime = runningTime;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMovieRated() {
		return movieRated;
	}
	public void setMovieRated(String movieRated) {
		this.movieRated = movieRated;
	}
	public String getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}

	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", price=" + price + ", movieRated=" + movieRated
				+ ", runningTime=" + runningTime + "]";
	}

} // end of class
