package reference;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 1 ~ 10까지 임의 수를 생성.
		// 학생이 10명
		int[] scores = new int[10]; // 0,0,0,0,0,0,0,0,0,0
		// System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			scores[i] = temp;

			// scores 배열타입. scores[0] int타입.
			// System.out.println(temp);
			System.out.printf("순서 : %d, 배열값 : %d\n", i + 1, scores[i]);
		}
		System.out.println("======끝1.");

		// 배열에 들어있는 요소들의 합.
		// 배열의 합계 : 55
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			scores[i] = i + 1;
			sum += scores[i];
		}
		System.out.println("배열의 합계는 " + sum);
		System.out.println("======끝2.");

		// 배열의 요소중 5보다 큰값만 합계.
		sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > 5) {
				sum += scores[i];
			}
		}
		System.out.println(sum);
		System.out.println("======끝3.");

		// 배열 요소 중 짝수번째 값만 합계.

		sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (i % 2 == 1) {
				sum += scores[i];
				System.out.printf("순서 %d, 합계 %d\n", i + 1, sum);
			}
		}
		System.out.println(sum);
		System.out.println("======끝4.");

	}

}
