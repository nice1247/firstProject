package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// 학생 30명
		// int s1... s30;
		// int num, String str;
		// 인덱스는 0부터
		// int, intAry[] 는 정수형 변수(기본타입), int[] intAry는 배열타입(참조타입)

		int[] intAry = { 1, 2, 3, 4, 5 };
		System.out.println("index 0의 (첫번째)값은 " + intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		System.out.println("====1 test");

		for (int i = 0; i <= 4; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("====배열 반복문");

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
			System.out.println("byte배열 : " + byteAry[i]);
		}

		for (int i = 0; i < strAry.length; i++) {
			System.out.println("string배열 : " + strAry[i]);
		} // 없는 값일때 멈추려면 ??? .length !!!! (length는 크기를 나타냄)

		double[] dblAry;
		dblAry = new double[] { 1, 2.3, 5 };

		float[] fltAry = new float[5];
		for (int i = 0; i < fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}

	}

}
