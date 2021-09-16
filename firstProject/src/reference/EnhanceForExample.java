package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5]; // null, null, null, null, null
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwan" };
		System.out.println(strAry.length);

		// �迭 3��° ��ġ�� ���� �ٲٰ� �ʹ�.
		strAry[2] = "Hong"; // ==(��), equals() (����)
		// ���� ���� ã��
		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("Hong"))
				System.out.println(strAry[i]);
		}
		System.out.println("==========��1.");

		// Enhanced for
		for (String str : strAry) {
			System.out.println(str);
		}
		// ���ǽ�, ������ ���� ��� x
		int[] scores = { 50, 70, 80, 60 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		System.out.println("=======��2.");

		// �л� 3���� ���� 4.2, 3.5, 2.8
		// �հ踦 ���� �� �ֵ��� ����.
		// ����� ����ؼ� �л���� : �Դϴ�.
		double sum1 = 0;
		double[] sc = { 4.2, 3.5, 2.8, 2.1 };
		for (double sco : sc) {
			sum1 += sco;
		}
		System.out.println(sum1);
		System.out.printf("�л���� : "+ sum1 / sc.length);

	}

}
