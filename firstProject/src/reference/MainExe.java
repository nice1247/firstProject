package reference;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		// 1. �л�������, 2. �л��̸��Է�, 3.���, 4.����
		String[] name = null;
		while (true) {
			showmenu();
			int selectNum = readInt("��ȣ�� �����ϼ���.");

			if (selectNum == 1) {
				int size = StudentNum();
				name = new String[size];

			} else if (selectNum == 2) {
				StudentName(name);

			} else if (selectNum == 3) {
				showList(name);

			} else if (selectNum == 4) {
				break;
			}
		}

	}

	public static int readInt(String mes) {
		Scanner scn = new Scanner(System.in);
		System.out.println(mes);
		int menu = scn.nextInt();
		return menu;
	}

	public static String readString(String mes) {
		Scanner scn = new Scanner(System.in);
		System.out.println(mes);
		String menu = scn.nextLine();
		return menu;
	}

	public static void showmenu() {
		System.out.println("1. �л�������, 2. �л��̸��Է�, 3.���, 4.����");
	}

	public static int StudentNum() {
		int a = readInt("�л� ���� �Է��ϼ���.");
		return a;
	}

	public static void StudentName(String[] ary) {
		for (int i = 0; i < ary.length; i++) {
			String b = readString("�л��̸��� �Է��ϼ���.");
		}
	}

	public static void showList(String[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
}
