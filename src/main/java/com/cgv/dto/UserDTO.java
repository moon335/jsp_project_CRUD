package com.cgv.dto;

public class UserDTO {
	
	private int id;
	private String userId;
	private String password;
	private String username;
	private String birthDate;
	private String tel;
	private String email;
	
	public UserDTO() {

	}
	
	public UserDTO(int id, String userId, String password, String username, String birthDate, String tel,
			String email) {
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.username = username;
		this.birthDate = birthDate;
		this.tel = tel;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userId=" + userId + ", password=" + password + ", username=" + username
				+ ", birthDate=" + birthDate + ", tel=" + tel + ", email=" + email + "]";
	}
	
} // end of class
