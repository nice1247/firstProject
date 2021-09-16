package reference;

public class MethodExample5 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		// 최소값을 구하는 코드.
		int minVal = getMinValue(scores);
		System.out.println("최소값 : " + minVal);
		System.out.println("==========Test end 1");

		int[] a = { 10, 11, 15, 19, 20, 4, -1 };
		minVal = getMinValue(a);
		System.out.println(minVal);
	}

	public static int getMinValue(int[] ary) {
		int minVal = 100;
		boolean T = true;
		for (int i = 0; i < ary.length; i++) {
			T = minVal > ary[i];
			if (T) {
				minVal = ary[i];
			}
		}

		return minVal;
	}
}
