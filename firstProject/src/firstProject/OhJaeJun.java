package firstProject;

import java.util.Scanner;

public class OhJaeJun {
	public static void main(String[] args) {
		int apple = 500;
		int banana = 1000;
		int sum = apple + banana;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("����� ������ �����ÿ�.");
		String a = scn.nextLine();
		int ap = Integer.parseInt(a);
		System.out.println("�ٳ����� ������ �����ÿ�.");
		int b = scn.nextInt();
		scn.nextLine();
		
		boolean money;
		sum = apple*ap + banana*b;
		money = sum <= 10000;
		
				
		
		if(money) {
			System.out.printf("������ �� �ִ�.");
		} else {
			System.out.printf("������ �� ����.");
		}
		
		
	}

}
