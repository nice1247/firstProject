package control;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1; // �ʱ��. // while ������ T,F�� ����
		while (i <= 10) {
			System.out.printf("i�� ���� %d\n", i);
			i++;
		} // >> for ������ �� ����

		boolean run = true;
		int cnt = 0;
		while (run) {
			cnt = (int) (Math.random() * 10) + 1;
			System.out.println(cnt);
			if (cnt == 8) {
				run = false;
			}
		} // >> ��� �����ؾ� �� �� �� �� �� ����, random - while�̶� �� ����

		int cnt1 = 0;
		while (true) {
			cnt1 = (int) (Math.random() * 10) + 1;
			System.out.println(cnt1);
			if (cnt1 == 6) {
				break;

			}
			System.out.println("====�L.");

		}
	}
}
