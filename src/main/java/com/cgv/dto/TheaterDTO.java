package com.cgv.dto;

public class TheaterDTO {
	
	private int id;
	private String city;
	private String name;
	
	public TheaterDTO() {
	}

	public TheaterDTO(int id, String city, String name) {
		this.id = id;
		this.city = city;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", city=" + city + ", name=" + name + "]";
	}
	
} // end of class
