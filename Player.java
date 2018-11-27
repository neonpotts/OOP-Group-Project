package codeNguoiChoi;

import java.io.Serializable;

import DemoMonopoly.LoginForm;

public class Player implements Serializable{
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
