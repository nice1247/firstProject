package reference;

public class ForExample {
	public static void main(String[] args) {

		{
			int i = 0;
			int j = 0;
		}
		
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("��1.");

		// 1 ~ 10 ¦���� ���

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("��2.");

		// 1 ~ 10 Ȧ���� ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��3.");

		sum = 0;
		// 1 ~ 10 sum�� ���� 20�� �Ѿ�� �� ���� Ƚ��.
		// ������ ������ �ʱⰪ���� ���ص� �� !!!!

		int i = 0;
		for (; i <= 20; i++) {

			sum += i;
			if (sum >= 20) {
				break;
			}
		}
		System.out.printf("�հ� : %d, Ƚ�� : %d", sum, i);
		System.out.println("��4.");

	}

}
