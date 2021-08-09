package com.phoneapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneApp {
	static final String rootPath = System.getProperty("user.dir") + "\\phonebook\\";
	static final String filename = rootPath + "phonebook.txt";
	public static void main(String[] args) {
		File file = new File(filename);
		
		Reader fr = null;
		Writer fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
				
		Scanner sc = new Scanner(System.in);
		
		PhoneController pc = new PhoneController();
		
		System.out.println("**********************************");
		System.out.println("*        전화번호 관리 프로그램       *");
		System.out.println("**********************************");
		
		try {
			
			
			while(true) {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("----------------------------------");
			System.out.print(">메뉴번호: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				ArrayList<Phone> phoneList = pc.getList();				System.out.println("<1.리스트>");
				 for(int i = 0; i < phoneList.size(); i++) {
                     System.out.println((i + 1) + ". " + phoneList.get(i));
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
				pc.addList(name, hd, tel);
				System.out.println("[등록되었습니다]");
				break;
			case 3 :
				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				int del = sc.nextInt();
				pc.delList(del-1);
				break;
			case 4 :
				System.out.println("<4.검색>");
				ArrayList<Phone> phoneSrch = pc.getList();
				System.out.print(">이름: ");
				String search = sc.next();
				for (int i = 0; i < phoneSrch.size(); i++) {
					if (phoneSrch.get(i).getName().contains(search)) {
					System.out.println((i+1) + ". " + phoneSrch.get(i));	
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("잘못 입력하셨습니다.");
		}
		finally {
			try {
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
