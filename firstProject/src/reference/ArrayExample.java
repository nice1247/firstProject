package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// �л� 30��
		// int s1... s30;
		// int num, String str;
		// �ε����� 0����
		// int, intAry[] �� ������ ����(�⺻Ÿ��), int[] intAry�� �迭Ÿ��(����Ÿ��)

		int[] intAry = { 1, 2, 3, 4, 5 };
		System.out.println("index 0�� (ù��°)���� " + intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		System.out.println("====1 test");

		for (int i = 0; i <= 4; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("====�迭 �ݺ���");

//		intAry = 10;
		intAry[0] = 6;
		intAry[1] = 7;
		intAry[2] = 8;
		intAry[3] = 9;
		intAry[4] = 10;
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		System.out.println("====2 test");

		byte[] byteAry = { 1, 2, 3 };

		String[] strAry = { "Hello", "Wolrd", "Nice" };
//		strAry = new String[] {1,2,3,4};
		strAry = new String[] { "hong", "kim", "park" };

		for (int i = 0; i < 3; i++) {
			System.out.println("byte�迭 : " + byteAry[i]);
		}

		for (int i = 0; i < strAry.length; i++) {
			System.out.println("string�迭 : " + strAry[i]);
		} // ���� ���϶� ���߷��� ??? .length !!!! (length�� ũ�⸦ ��Ÿ��)

		double[] dblAry;
		dblAry = new double[] { 1, 2.3, 5 };

		float[] fltAry = new float[5];
		for (int i = 0; i < fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}

	}

}
