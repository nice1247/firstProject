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

		System.out.println("끝1.");

		// 1 ~ 10 짝수만 출력

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("끝2.");

		// 1 ~ 10 홀수만 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("끝3.");

		sum = 0;
		// 1 ~ 10 sum의 값이 20을 넘어서는 그 때의 횟수.
		// 선언한 변수를 초기값으로 정해도 돼 !!!!

		int i = 0;
		for (; i <= 20; i++) {

			sum += i;
			if (sum >= 20) {
				break;
			}
		}
		System.out.printf("합계 : %d, 횟수 : %d", sum, i);
		System.out.println("끝4.");

	}

}
