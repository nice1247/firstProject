package firstProject;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		//���� : ����� �Է�(10, 20)
		// 10 + 20 = 30
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���.");
		int a = scn.nextInt();
		scn.nextLine();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		int b = scn.nextInt();
		scn.nextLine();
		
		int result = a + b;
		System.out.println("[���]");
		System.out.printf("%d + %d = %d %n", a, b, result);
		System.out.println(a +" + "+ b +" = "+ result);
		
		
	}

}
