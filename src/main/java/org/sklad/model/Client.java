package org.sklad.model;

public class Client {

	private String name;
	private String phone;
	private String address;
	private String password;
	
	public Client(){}

	public Client(String name, String password, String address){
		this.name = name;
		this.password = password;
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + address;
	}
}
