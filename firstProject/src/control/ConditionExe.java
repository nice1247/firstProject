package control;

public class ConditionExe {
	public static void main(String[] args) {
		// 두 정수 60, 70
		// 두 수를 합한 결과 100점 넘어서면 합격, 안되면 불합격
		// 끝.

		// 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수.
		// 끝.

		// a / 10 복합대입연산자이용
		// 4... 2의 배수입니다
		// 2의 배수이면 2의 배수, 3의 배수이면 3의 배수, 6의 배수이면 2와 3의 배수 다 나오도록

		int a = 60;
		int b = 70;
		int sum = a + b;

		if (sum >= 100) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("1번 끝.");

		int multiple = a * b;
		int c = multiple % 2;

		if (c == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println("2번 끝");

		int num1 = 6;
		int x = num1 % 2;
		int y = num1 % 3;

		if (x == 0) {
			System.out.println("2의 배수입니다.");
		} else if (y == 0) {
			System.out.println("3의 배수입니다.");
		}
		if (x == 0 & y == 0) {
			System.out.println("6의 배수입니다.");
		}
		System.out.println("끝.");

		num1 = 12;
		if (num1 % 2 == 0 && num1 % 3 == 0) {
			System.out.println("6의 배수입니다.");
		} else if (num1 % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if (num1 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		System.out.println("3번 끝.");

		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// switch조건문 -> 1이 나왔습니다.
		// 4번끝.

		switch (randomValue) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2이 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4이 나왔습니다.");
			break;
		case 5:
			System.out.println("5이 나왔습니다.");
			break;
		case 6:
			System.out.println("6이 나왔습니다.");
			break;
		}
		System.out.println("4번 끝.");

		System.out.println();

		// 0~99점 90 80 70 60
		int randomScore = (int) (Math.random() * 100);
		System.out.println(randomScore);
		if (randomScore >= 90) {
			System.out.println("A학점");
		} else if (randomScore >= 80) {
			System.out.println("B학점");
		} else if (randomScore >= 70) {
			System.out.println("C학점");
		} else if (randomScore >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		System.out.println("5번 끝.");
		System.out.println();

		randomScore /= 10;
		switch (randomScore) {
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}
		System.out.println("6번 끝.");
	}

}
