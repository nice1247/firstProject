package reference;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 1 ~ 10���� ���� ���� ����.
		// �л��� 10��
		int[] scores = new int[10]; // 0,0,0,0,0,0,0,0,0,0
		// System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			scores[i] = temp;

			// scores �迭Ÿ��. scores[0] intŸ��.
			// System.out.println(temp);
			System.out.printf("���� : %d, �迭�� : %d\n", i + 1, scores[i]);
		}
		System.out.println("======��1.");

		// �迭�� ����ִ� ��ҵ��� ��.
		// �迭�� �հ� : 55
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			scores[i] = i + 1;
			sum += scores[i];
		}
		System.out.println("�迭�� �հ�� " + sum);
		System.out.println("======��2.");

		// �迭�� ����� 5���� ū���� �հ�.
		sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > 5) {
				sum += scores[i];
			}
		}
		System.out.println(sum);
		System.out.println("======��3.");

		// �迭 ��� �� ¦����° ���� �հ�.

		sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (i % 2 == 1) {
				sum += scores[i];
				System.out.printf("���� %d, �հ� %d\n", i + 1, sum);
			}
		}
		System.out.println(sum);
		System.out.println("======��4.");

	}

}
