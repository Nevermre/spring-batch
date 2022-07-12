package com.infybuzz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class StudentXml {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	@Override
	public String toString() {
		return "StudentXml [ID=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
