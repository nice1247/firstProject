package control;

public class OhJaeJun {
	public static void main(String[] args) {
		// if for (while) break continue�� ����Ͽ�
		// �� ������ �����Ͽ� ������

		int roll = 0;
		int sum = 0;
		if (roll <= 6) {
			for (int i = 1; i <= 6; i++) {
				int dice = (int) (Math.random() * 10) + 1;
				System.out.println(dice);
				sum += dice;
				roll++;
			}
		}
		System.out.printf("�� �� �Ÿ� : %d, ���� Ƚ�� : %d", sum, roll);

	}
}
