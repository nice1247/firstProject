package control;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "홍길동";
		String age = "20";
		String phone = "010-1234-1234";
		Scanner scn = new Scanner(System.in);
		
		// 사용자의 Scanner 사용
		// 1 > 이름, 2 > 나이, 3 > 연락처, 4 > 반복문종료.
		
		while(true) {
			System.out.println("메뉴늘 선택하세요.");
			System.out.println("1.이름 2.나이 3.연락처 4.종료");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.printf("이름 : "+name+"\n");
			} else if(menu == 2) {
				System.out.printf("나이 : "+age +"\n");
			} else if(menu == 3) {
				System.out.printf("연락처 : "+phone+"\n");
			} else if(menu == 4) {
				break;
			} 
		} System.out.println("끝.");

	}

}
