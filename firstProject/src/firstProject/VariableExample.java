package firstProject;

public class VariableExample {
	public static void main(String[] args) {
		int number1 = 10; // 변수 <--> 상수
		System.out.println("결과 : " + number1);
		number1 = 20;
		System.out.println("결과 : " + number1);
		number1 = 30;
		System.out.println("결과 : " + number1);
		
//		int number1 = 90; 동일 변수선언해서 에러
		int number3 = 90;
		int result;
//		int-정수, double-실수
		
		final int number2 = 20;
//		number2 = 30; 이건 상수이기 때문에 에러
		
		result = number1 + number2;
		double result1 = number3 / 20.0; // int/int = int, int/double = double
// byte < short < int < long < float < double (큰 타입으로 계산)
		
		System.out.println("결과값 : " + result1);
		System.out.println("결과값 : " + result);
		System.out.println("결과 : " + number1 + number2);
		
	}

}
