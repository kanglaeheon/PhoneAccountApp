package com.phoneaccountapp;

import java.util.Scanner;

public class PhoneAccountApp {
		static final int LIST = 1;
		static final int INSERT = 2;
		static final int DELETE = 3;
		static final int SEARCH = 4;
		static final int EXIT = 5;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************");
		System.out.println("*        전화번호 관리 프로그램       *");
		System.out.println("**********************************");
		
		while(true) {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("----------------------------------");
			System.out.print(">메뉴번호: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case LIST :
				break;
			case INSERT :

				break;
			case DELETE :

				break;
			case SEARCH :

				break;				
			case EXIT : 
				System.out.println("**********************************");
				System.out.println("*    프로그램을 종료합니다, 감사합니다   *");
				System.out.println("**********************************");
				sc.close();
				return;
			default :
				System.out.println("[다시입력해주세요]");
			}
		}

	}
		
	public void phoneList() {
		System.out.println("<1.리스트>");
		
	}
	
	public void phoneNew(String name, String hp, String tel) {
		System.out.println("<2.등록>");
		System.out.print(">이름: ");
		System.out.print(">휴대전화: ");
		System.out.print(">집전화: ");
		
	}
	
	public void phoneDel() {
		System.out.println("<3.삭제>");
		System.out.print(">번호: ");
	}
	
	public void phoneSearch() {
		System.out.println("<4.검색>");
		System.out.print(">이름: ");
	}
}
