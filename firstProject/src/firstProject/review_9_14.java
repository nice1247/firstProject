package firstProject;

import java.util.Scanner;

public class review_9_14 {
	public static void main(String[] args) {
		// byte(1byte) < short, char(2) < int(4) < long(8) < float < double
		// char-����, int-����, double-�Ǽ�, String-���ڿ�
		// long > L, Float > f
		System.out.println(Byte.MAX_VALUE);
		//System.out.println(Int.MAX_VALUE); �� �ȵ��� ??
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		int a = -30;
		int b = 20;
		int result = a+b;
		
		boolean sth;
		sth = (a+b) >= 0;
		if(sth) {
			System.out.println("����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		String room1 = "secret";
		String room2 = "open";
		boolean maze = room1 == room2;
		System.out.println(maze);
		room1 = room2;
		maze = room1 == room2;
		System.out.println(maze);
		// �� ���� ������� ?? >>> System.out.println(); ���ϱ� ��
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("1�� ���� ������ �Է��ϼ���");
		int num1 = scn.nextInt();
		scn.nextLine();
		
		boolean pass1;
		pass1 = num1 >=70;
		if(pass1) {
			System.out.println("1�� �հ��Դϴ�.");
			System.out.println();
			System.out.println("2�� ���� ������ �Է��ϼ���");
			int num2 = scn.nextInt();
			scn.nextLine();
			
			boolean pass2;
			pass2 = num2 >= 80;
			if(pass2) {
				System.out.println("���� �հ��Դϴ�.");
				System.out.println();
			} else {
				System.out.println("���հ��Դϴ�.");
			}
			
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
//		boolean pass2;
//		pass2 = num2 >= 80; num2 �� �о����!!! if�����ȿ� num2�� �־ ??

		
		System.out.println("�Է��ϼ���.");
		String exam1 = scn.nextLine();
		if(exam1.equals("")) {
			exam1 = "0";
		}
		System.out.println("�Է��ϼ���2");
		int exam2 = scn.nextInt();
		scn.nextLine();
		//if(exam2 = "") {       //int�� �ƴ϶� String���� �ؾ� �����Է°��� ??
		
		
		

	}

}



// ����, boolean , scanner, if.....