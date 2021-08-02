package com.phoneaccountapp;



public class PhoneAccount {
	//	필드
	String name;
	String hp;
	String tel;
	
	//	생성자
	PhoneAccount(String name, String hp, String tel) {
		setName(name);
		setHp(hp);
		setTel(tel);
	}

	//	Getters / Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return name + "," + hp + "," + tel;
	}
	
	
	
}
