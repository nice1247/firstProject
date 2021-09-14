package firstProject;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		//변수 : 사용자 입력(10, 20)
		// 10 + 20 = 30
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요.");
		int a = scn.nextInt();
		scn.nextLine();
		System.out.println("두번째 값을 입력하세요.");
		int b = scn.nextInt();
		scn.nextLine();
		
		int result = a + b;
		System.out.println("[결과]");
		System.out.printf("%d + %d = %d %n", a, b, result);
		System.out.println(a +" + "+ b +" = "+ result);
		
		
	}

}
