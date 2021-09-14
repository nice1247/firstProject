package firstProject;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		// 영어점수입력 : 
		// 수학점수입력 : 
		// 이름입력 : 
		// 합계점수가 120점 이상
		// 이름 님의 영어, 수학 점수의 합은 ?, 평균은 ?(printf사용)
		// 홍길동님은 (불)합격입니다.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("영어점수입력");
		int eng = scn.nextInt();
		scn.nextLine();
		System.out.println("수학점수입력");
		int math = scn.nextInt();
		scn.nextLine();
		System.out.println("이름입력");
		String name = scn.nextLine();
		
		int sum = eng + math;
		int avg = sum/2;
		System.out.printf("%s 님의 영어, 수학 점수의 합은 %d, 평균은 %d 입니다. %n", name, sum, avg);
		
		boolean pass;
		pass = sum >= 120;
		
		if(pass) {
			System.out.println(name + "님은 합격입니다.");
		} else {
			System.out.println(name + "님은 불합격입니다.");
		}
		
	}

}
