package control;

public class ConditionExe {
	public static void main(String[] args) {
		// �� ���� 60, 70
		// �� ���� ���� ��� 100�� �Ѿ�� �հ�, �ȵǸ� ���հ�
		// ��.

		// �� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��.
		// ��.

		// a / 10 ���մ��Կ������̿�
		// 4... 2�� ����Դϴ�
		// 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ���, 6�� ����̸� 2�� 3�� ��� �� ��������

		int a = 60;
		int b = 70;
		int sum = a + b;

		if (sum >= 100) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		System.out.println("1�� ��.");

		int multiple = a * b;
		int c = multiple % 2;

		if (c == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		System.out.println("2�� ��");

		int num1 = 6;
		int x = num1 % 2;
		int y = num1 % 3;

		if (x == 0) {
			System.out.println("2�� ����Դϴ�.");
		} else if (y == 0) {
			System.out.println("3�� ����Դϴ�.");
		}
		if (x == 0 & y == 0) {
			System.out.println("6�� ����Դϴ�.");
		}
		System.out.println("��.");

		num1 = 12;
		if (num1 % 2 == 0 && num1 % 3 == 0) {
			System.out.println("6�� ����Դϴ�.");
		} else if (num1 % 2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		} else if (num1 % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}
		System.out.println("3�� ��.");

		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// switch���ǹ� -> 1�� ���Խ��ϴ�.
		// 4����.

		switch (randomValue) {
		case 1:
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2�� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3�� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6�� ���Խ��ϴ�.");
			break;
		}
		System.out.println("4�� ��.");

		System.out.println();

		// 0~99�� 90 80 70 60
		int randomScore = (int) (Math.random() * 100);
		System.out.println(randomScore);
		if (randomScore >= 90) {
			System.out.println("A����");
		} else if (randomScore >= 80) {
			System.out.println("B����");
		} else if (randomScore >= 70) {
			System.out.println("C����");
		} else if (randomScore >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
		System.out.println("5�� ��.");
		System.out.println();

		randomScore /= 10;
		switch (randomScore) {
		case 9:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		case 7:
			System.out.println("C����");
			break;
		case 6:
			System.out.println("D����");
			break;
		default:
			System.out.println("F����");
		}
		System.out.println("6�� ��.");
	}

}
