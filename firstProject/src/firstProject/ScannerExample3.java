package firstProject;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		// ���������Է� : 
		// ���������Է� : 
		// �̸��Է� : 
		// �հ������� 120�� �̻�
		// �̸� ���� ����, ���� ������ ���� ?, ����� ?(printf���)
		// ȫ�浿���� (��)�հ��Դϴ�.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���������Է�");
		int eng = scn.nextInt();
		scn.nextLine();
		System.out.println("���������Է�");
		int math = scn.nextInt();
		scn.nextLine();
		System.out.println("�̸��Է�");
		String name = scn.nextLine();
		
		int sum = eng + math;
		int avg = sum/2;
		System.out.printf("%s ���� ����, ���� ������ ���� %d, ����� %d �Դϴ�. %n", name, sum, avg);
		
		boolean pass;
		pass = sum >= 120;
		
		if(pass) {
			System.out.println(name + "���� �հ��Դϴ�.");
		} else {
			System.out.println(name + "���� ���հ��Դϴ�.");
		}
		
	}

}
