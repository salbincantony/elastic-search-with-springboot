package com.example.demo.document;


public class ProfileDocument {

	private String id;
	private String firstName;
	private String lastName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	// private List<Technologies> technologies;
//private Location location;
//private List<String> emails;
	public ProfileDocument() {
		super();
	}

	public ProfileDocument(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}