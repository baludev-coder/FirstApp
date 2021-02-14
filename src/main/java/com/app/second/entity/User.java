package com.app.second.entity;

public class User {
	private Integer id;
	private String uname;
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(Integer id, String uname, String address) {
		super();
		this.id = id;
		this.uname = uname;
		this.address = address;
	}

}
