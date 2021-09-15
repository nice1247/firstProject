package firstProject;

import java.util.Scanner;

public class review_9_14 {
	public static void main(String[] args) {
		// byte(1byte) < short, char(2) < int(4) < long(8) < float < double
		// char-문자, int-정수, double-실수, String-문자열
		// long > L, Float > f
		System.out.println(Byte.MAX_VALUE);
		//System.out.println(Int.MAX_VALUE); 왜 안되지 ??
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		int a = -30;
		int b = 20;
		int result = a+b;
		
		boolean sth;
		sth = (a+b) >= 0;
		if(sth) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		String room1 = "secret";
		String room2 = "open";
		boolean maze = room1 == room2;
		System.out.println(maze);
		room1 = room2;
		maze = room1 == room2;
		System.out.println(maze);
		// 줄 띄우기 어떻게하지 ?? >>> System.out.println(); 쓰니까 됨
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("1차 시험 점수를 입력하세요");
		int num1 = scn.nextInt();
		scn.nextLine();
		
		boolean pass1;
		pass1 = num1 >=70;
		if(pass1) {
			System.out.println("1차 합격입니다.");
			System.out.println();
			System.out.println("2차 시험 점수를 입력하세요");
			int num2 = scn.nextInt();
			scn.nextLine();
			
			boolean pass2;
			pass2 = num2 >= 80;
			if(pass2) {
				System.out.println("최종 합격입니다.");
				System.out.println();
			} else {
				System.out.println("불합격입니다.");
			}
			
		} else {
			System.out.println("불합격입니다.");
		}
		
//		boolean pass2;
//		pass2 = num2 >= 80; num2 못 읽어들임!!! if구문안에 num2가 있어서 ??

		
		System.out.println("입력하세요.");
		String exam1 = scn.nextLine();
		if(exam1.equals("")) {
			exam1 = "0";
		}
		System.out.println("입력하세요2");
		int exam2 = scn.nextInt();
		scn.nextLine();
		//if(exam2 = "") {       //int가 아니라 String으로 해야 공백입력가능 ??
		
		
		

	}

}



// 변수, boolean , scanner, if.....