package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;

		// 1~10까지 출력 하는 do while

		int num = 1;
		do {
			System.out.println(num);
			num++;
			if (num > 10) {
				break;
			}
		} while (true);
		System.out.println("====끝1.");

		// 짝수만 출력 + continue.

		num = 1;
		do {
			num++;
			if (num % 2 == 1) {
				continue;
			}
			System.out.println(num);
			if (num >= 10) {
				break;
			}
		} while (true);
		System.out.println("====짝수 끝2.");

		num = 0;
		do {
			num++;
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
			if (num >= 8) {
				break;
			}
		} while (true);
		System.out.println("====홀수 끝.");

		num = 0;
		int sum = 0;
		do {
			num++;
			if (num % 2 == 0) {
				continue;
			}
			sum += num;
			if (num >= 8) {
				break;
			}
		} while (true);
		System.out.println(sum);

		System.out.println("====홀수 합 끝3.");

		int a = 0;
		int b = 0;
		do {
			if (a >= 10) {
				break;
			}
			if (a % 2 == 0) {
				a++;
				continue;
			}
			b += a++;

		} while (true);
		System.out.println(b);
		System.out.println("====홀수 합 끝3(2).");

		// 임의의 값을 1~10;
		// sum 값이 100보다 큰 수가 되었을 때
		// 그 때의 sum 값을 출력... 몇 번 실행을 했나 ?

		int ran = (int) (Math.random() * 10) + 1;
		sum = 0;
		a = 0;
		do {
			sum += ran;
			if (sum >= 100) {
				break;
			}
			a++;
		} while (true);
		System.out.printf("합계 : %d 시행횟수 : %d", sum, a);
		System.out.println("\n====100 sum 끝4.");

	}

}
