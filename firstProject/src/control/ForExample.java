package control;

public class ForExample {
	public static void main(String[] args) {
		int cnt = 0;

		cnt += 1;
		System.out.printf("cnt : %d \n", cnt);
		cnt += 1;
		System.out.printf("cnt : %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt : %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt : %d\n", cnt);

		System.out.println("====다시1====");
		cnt = 0;
		for (int i = 1; i <= 5; i++) { // 몇 번 반복할건지
			cnt += i; // 어떤 조건을 줬는지
			System.out.printf("i: %d, cnt: %d\n", i, cnt); // 무엇을 출력할건지
		}
		System.out.println("반복문끝.");
		
		int tempValue = 0;
		System.out.println("====다시2====");
		for (int i = 1; i <= 5; i++) {
			tempValue += (int) (Math.random() * 10) + 1;

			System.out.printf("%d번째 값 : %d \n", i, tempValue);
		}
		System.out.println("sum:" + tempValue);
		System.out.println("반복문 다시2 끝.");

	}

}
