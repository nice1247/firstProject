package firstProject;

import java.util.Scanner;

public class OhJaeJun {
	public static void main(String[] args) {
		int apple = 500;
		int banana = 1000;
		int sum = apple + banana;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("사과의 개수를 적으시오.");
		String a = scn.nextLine();
		int ap = Integer.parseInt(a);
		System.out.println("바나나의 개수를 적으시오.");
		int b = scn.nextInt();
		scn.nextLine();
		
		boolean money;
		sum = apple*ap + banana*b;
		money = sum <= 10000;
		
				
		
		if(money) {
			System.out.printf("구매할 수 있다.");
		} else {
			System.out.printf("구매할 수 없다.");
		}
		
		
	}

}
