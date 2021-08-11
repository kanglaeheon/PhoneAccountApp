package com.phoneapp.v2;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
	
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("*        전화번호 관리 프로그램       *");
		System.out.println("**********************************");

		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
				System.out.println("----------------------------------");
				System.out.print(">메뉴번호: ");

				switch(sc.nextInt()) {
				case 1 :
					listPb();
					break;
				case 2 :
					insertPb(sc);
					break;
				case 3 :
					deletePb(sc);
					break;
				case 4 :
					searchPb(sc);
					break;
				case 5 :
					System.out.println("**********************************");
					System.out.println("*    프로그램을 종료합니다, 감사합니다   *");
					System.out.println("**********************************");
					return;
				default :
					System.out.println("[다시입력해주세요]");
				}
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}
		}
	}
	
	// 1. 리스트 메소드
	private static void listPb() {
		System.out.println("<1.리스트>");
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		List<PhoneBookVO> list = dao.getList();
		Iterator<PhoneBookVO> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVO vo = it.next();
			System.out.printf("%d. %s %s  %s%n",
					vo.getId(),
					vo.getName(),
					vo.getHp(),
					vo.getTel());
        }
		System.out.println();
	}
	
	// 2. 등록 메소드
	private static void insertPb(Scanner sc) {
		System.out.println("<2.등록>");
		System.out.print(">이름: ");
		String name = sc.next();
		System.out.print(">휴대전화: ");
		String hd = sc.next();
		System.out.print(">전화번호: ");
		String tel = sc.next();
		
		PhoneBookVO vo = new PhoneBookVO(name, hd, tel);
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		boolean success = dao.insert(vo);
				
		System.out.println(success ? "[등록되었습니다]" : "[등록에 실패하였습니다]");
		System.out.println();
	}
	
	// 3. 삭제 메소드
	private static void deletePb(Scanner sc) {
		System.out.println("<3.삭제>");
		
		System.out.print(">번호: ");
		long id = sc.nextLong();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		boolean success = dao.delete(id);
		
		System.out.println(success ? "[삭제되었습니다]" : "[삭제에 실패하였습니다]");
		System.out.println();
	}
	
	// 4. 검색 메소드
	private static void searchPb(Scanner sc) {
		System.out.println("<4.검색>");	
		System.out.print(">이름: ");
		String keyword = sc.next();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		List<PhoneBookVO> list = dao.search(keyword);
		Iterator<PhoneBookVO> it = list.iterator();
		
		while(it.hasNext() ) {
			PhoneBookVO vo = it.next();
			System.out.printf("%d. %s %s  %s",
					vo.getId(),
					vo.getName(),
					vo.getHp(),
					vo.getTel());
		}
		
		System.out.println();
	}
		
}
