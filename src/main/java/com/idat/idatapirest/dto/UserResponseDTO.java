package com.idat.idatapirest.dto;

public class UserResponseDTO {
	
	private String token;

	public UserResponseDTO() {
		super();
	}

	public UserResponseDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}