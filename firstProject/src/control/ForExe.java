package control;

public class ForExe {
	public static void main(String[] args) {
		// 1 ~ 10 출력

		int num1 = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("====끝1.");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("====끝2.");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("====끝3.");

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("====끝4.");  /// 변수를 조건문 안에 넣을 것인지 밖에 둘 것인지 잘 판단 할 것 !!

		
	}

}
