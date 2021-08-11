package com.phoneapp.v1;

import java.util.ArrayList;

public class PhoneController {
	private ArrayList<Phone> phone = new ArrayList<>();
	
	public ArrayList<Phone> getList() {
		return phone;
	}
	
	public void addList(String name, String hp, String tel) {
		Phone ph = new Phone(name, hp, tel);
		phone.add(ph);
	}
	
	public void delList(int i) {
		phone.remove(i);
	}
	
}
