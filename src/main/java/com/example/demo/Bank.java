package com.example.demo;

public class Bank {
	
	private String name,address,branchName,city;

	public Bank() {	};
	
	public Bank(String name, String address, String branchName, String city) {
		super();
		this.name = name;
		this.address = address;
		this.branchName = branchName;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", address=" + address + ", branchName=" + branchName + ", city=" + city + "]";
	}
	
}
