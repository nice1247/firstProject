package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;

		// 1~10���� ��� �ϴ� do while

		int num = 1;
		do {
			System.out.println(num);
			num++;
			if (num > 10) {
				break;
			}
		} while (true);
		System.out.println("====��1.");

		// ¦���� ��� + continue.

		num = 1;
		do {
			num++;
			if (num % 2 == 1) {
				continue;
			}
			System.out.println(num);
			if (num >= 10) {
				break;
			}
		} while (true);
		System.out.println("====¦�� ��2.");

		num = 0;
		do {
			num++;
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
			if (num >= 8) {
				break;
			}
		} while (true);
		System.out.println("====Ȧ�� ��.");

		num = 0;
		int sum = 0;
		do {
			num++;
			if (num % 2 == 0) {
				continue;
			}
			sum += num;
			if (num >= 8) {
				break;
			}
		} while (true);
		System.out.println(sum);

		System.out.println("====Ȧ�� �� ��3.");

		int a = 0;
		int b = 0;
		do {
			if (a >= 10) {
				break;
			}
			if (a % 2 == 0) {
				a++;
				continue;
			}
			b += a++;

		} while (true);
		System.out.println(b);
		System.out.println("====Ȧ�� �� ��3(2).");

		// ������ ���� 1~10;
		// sum ���� 100���� ū ���� �Ǿ��� ��
		// �� ���� sum ���� ���... �� �� ������ �߳� ?

		int ran = (int) (Math.random() * 10) + 1;
		sum = 0;
		a = 0;
		do {
			sum += ran;
			if (sum >= 100) {
				break;
			}
			a++;
		} while (true);
		System.out.printf("�հ� : %d ����Ƚ�� : %d", sum, a);
		System.out.println("\n====100 sum ��4.");

	}

}
