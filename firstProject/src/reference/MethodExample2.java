package reference;

public class MethodExample2 {

	// 실행 메소드
	public static void main(String[] args) {
		sum(24, 55); // 메소드 실행.
		int a = 45, b = 77;
		sum(a, b);
		multi(35, 88);
		square(3.5);
		int res = getMax(a, b);
		System.out.println("큰 수는 : " + res);

		System.out.println("결과는 : " + divide(5, 3));

	}

	// 두 정수를 입력받아서 두 수의 합을 console에 보여주도록.
	// void = return 값?? 타입이 없다 ?

	// 정의 메소드
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두 수의 합 : " + sum);

	}

	// 두 정수를 입력받아서 두 수의 곱을 console로
	public static void multi(int n3, int n4) {
		int multi = n3 * n4;
		System.out.println("두 수의 곱 : " + multi);

	}

	// 정사각형 너비를 계산해주는 메소드.
	public static void square(double n5) {
		double square = n5 * n5;
		System.out.println("정사각형의 너비는 " + square);
	}

	// 두 수 중에서 큰 값을 반환해주는 메소드.
	public static int getMax(int a, int b) {
		int result = (a >= b) ? a : b; // 삼항 연산자 식 ? true : false !!!!!
		return result;
	}

	// 두 정수를 입력받아서 첫번째 / 두번째 나눈 결과(반환)
	public static double divide(int a, int b) {
		return (double) a / b;
	}

}
