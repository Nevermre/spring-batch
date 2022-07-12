package com.infybuzz.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class StudentJson {
	private Long ID;
	private String firstName;
	private String lastName;
	private String email;
	@Override
	public String toString() {
		return "StudentJson [ID=" + ID + ", firstName=" + firstName +  ", email=" + email
				+ "]";
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	  public String getLastName() { return lastName; } public void
	  setLastName(String lastName) { this.lastName = lastName; }
	 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
