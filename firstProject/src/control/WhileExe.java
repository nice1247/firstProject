package control;

public class WhileExe {
	public static void main(String[] args) {

		// while 구문을 1~10까지 출력.

		int a = 0;
		while (true) {
			a++;
			System.out.println(a);
			if (a >= 10) {
				break;
			}
		}
		System.out.println("1~10 끝 ====");
		System.out.println();

		a = 1;
		while (a <= 10) {
			if (a % 2 == 0)
				System.out.println(a);
			a++;
		}
		System.out.println("짝수 끝 ====");
		System.out.println();

		a = 1;
		while (a <= 10) {
			if (a % 2 == 1)
				System.out.println(a);
			a++;
		}
		System.out.println("홀수 끝 ====");
		System.out.println();

		a = 1;
		int sum = 0;
		while (a <= 10) {
			sum += a;
			a++;
		}
		System.out.println(sum);
		System.out.println("sum 끝 ====");

		a = 1;
		while (true) {
			if (a > 10) {
				if (a % 2 == 0) {
					System.out.println(a);
				}
				a++;
				
			}break;   // <<<<<<<< 여기 해결해~
		}

	}
}
