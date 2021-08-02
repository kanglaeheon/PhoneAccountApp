package com.phoneaccountapp;

import java.util.Scanner;

public class PhoneAccountApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************");
		System.out.println("*        전화번호 관리 프로그램       *");
		System.out.println("**********************************");
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("----------------------------------");
		System.out.print(">메뉴번호: ");
		
		switch(true) {
		case 1 :
			System.out.println("<1.리스트>");
			showinfo();
		case 2 :
			System.out.println("<2.등록>");
			System.out.print(">이름: ");
			System.out.print(">휴대전화: ");
			System.out.print(">집전화: ");
		case 3 :
			System.out.println("<3.삭제>");
			System.out.print(">번호: ");
		case 4 :
			System.out.println("<4.검색>");
			System.out.print(">이름: ");
			
		case 5 : 
			System.out.println("**********************************");
			System.out.println("*            감사합니다            *");
			System.out.println("**********************************");
			break;
		default :
			System.out.println("[다시입력해주세요]");
		}

	}

}
