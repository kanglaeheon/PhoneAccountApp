package com.phoneapp.v1;

public class Phone {
	//	필드
	private String name;
	private String hp;
	private String tel;
	
	//	생성자
	public Phone (String name, String hp, String tel) {
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}

	//	Getters / Setters
	
	public String getName() {
		return name;
	}

	public String getHp() {
		return hp;
	}


	public String getTel() {
		return tel;
	}

	@Override
	public String toString() {
		return name + ", " + hp + ", " + tel;
	}
		
}
