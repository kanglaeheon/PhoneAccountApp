package com.phoneapp;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneApp {
	public static void main(String[] args) {
		PhoneRun();
	}
	
	private static void PhoneRun() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> phone = new ArrayList<>();
		
		System.out.println("**********************************");
		System.out.println("*        전화번호 관리 프로그램       *");
		System.out.println("**********************************");
		
		while(true) {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("----------------------------------");
			System.out.print(">메뉴번호: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("<1.리스트>");
				 for(int i=0; i<phone.size(); i++) {
                     System.out.println((i+1)+". "+phone.get(i));
                }
				break;
			case 2 :
				System.out.println("<2.등록>");
				System.out.print(">이름: ");
				String name = sc.next();
				System.out.print(">휴대전화: ");
				String hd = sc.next();
				System.out.print(">전화번호: ");
				String tel = sc.next();
				phone.add(new Phone(name, hd, tel));
				System.out.println("[등록되었습니다]");
				break;
			case 3 :
				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				int del = sc.nextInt();
				phone.remove(del-1);
				break;
			case 4 :
				System.out.println("<4.검색>");
				System.out.print(">이름: ");
				String search = sc.next();
				for (int i = 0; i < phone.size(); i++) {
					if (search.equals(phone.get(i).getName())) {
					System.out.println((i+1) + ". " + phone.get(i));	
					}
				}	
				break;
			case 5 : 
				System.out.println("**********************************");
				System.out.println("*    프로그램을 종료합니다, 감사합니다   *");
				System.out.println("**********************************");
				sc.close();
				return;
			default :
				System.out.println("[다시입력해주세요]");
			}	//	switch 끝
		}	//	while 끝
	}	//	PhoneRun() 끝
}
