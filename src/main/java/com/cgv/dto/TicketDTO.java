package com.cgv.dto;

public class TicketDTO {
	
	private int id;
	private String date;
	private String startTime;
	private int userId;
	private int theaterId;
	private int movieId;
	private int seatId;
	private String username;
	private String city;
	private String theaterName;
	private String seatName;
	private String movieName;
	private int price;
	private String movieRated;
	private String runningTime;
	
	public TicketDTO() {}
	
	public TicketDTO(int id, String date, String startTime, int userId, int theaterId, int movieId, int seatId) {
		this.id = id;
		this.date = date;
		this.startTime = startTime;
		this.userId = userId;
		this.theaterId = theaterId;
		this.movieId = movieId;
		this.seatId = seatId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
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
		return "TicketDTO [id=" + id + ", date=" + date + ", startTime=" + startTime + ", userId=" + userId
				+ ", theaterId=" + theaterId + ", movieId=" + movieId + ", seatId=" + seatId + "]";
	}
	
} // end of class
