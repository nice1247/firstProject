package control;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		String age = "20";
		String phone = "010-1234-1234";
		Scanner scn = new Scanner(System.in);
		
		// ������� Scanner ���
		// 1 > �̸�, 2 > ����, 3 > ����ó, 4 > �ݺ�������.
		
		while(true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.�̸� 2.���� 3.����ó 4.����");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.printf("�̸� : "+name+"\n");
			} else if(menu == 2) {
				System.out.printf("���� : "+age +"\n");
			} else if(menu == 3) {
				System.out.printf("����ó : "+phone+"\n");
			} else if(menu == 4) {
				break;
			} 
		} System.out.println("��.");

	}

}
