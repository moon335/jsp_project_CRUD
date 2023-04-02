package com.cgv.dto;

public class SeatDTO {
	
	private int id;
	private String name;
	private int isChecked;
	
	public SeatDTO() {
	}
	
	public SeatDTO(int id, String name, int isChecked) {
		this.id = id;
		this.name = name;
		this.isChecked = isChecked;
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

	@Override
	public String toString() {
		return "SeatDAO [id=" + id + ", name=" + name + ", isChecked=" + isChecked + "]";
	}
	
	
} // end of class
