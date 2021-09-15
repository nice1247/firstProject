package operator;

public class OperatorExample {
	public static void main(String[] args) {
		// +, -, *, /, %    ///    &, |, ^, ~
		int num1, num2, result;
		num1 = 10;
		num2 = 5;
//		result = num2 = num1;
		
		result = num1 * num2; // 할당(대입)연산자
		
//		num1 * num2 = result; (x)
		result = -result;
		System.out.printf("-연산결과 : %d \n", result);
		
		result = num1 % 3;
		System.out.printf("연산결과 : %d \n", result);
		
		result = num1 & num2;
		System.out.printf("& 연산결과 : %d \n", result);
		
		result = num1 | num2;
		System.out.printf("| 연산결과 : %d \n", result);
		
		result = num1 ^ num2;
		System.out.printf("^ 연산결과 : %d \n", result);
		
		result = ~num1;  //  2진수 => ~ + 1 = 0
		// ex) 3 + (-3) = 0  0000 0011 (-3 = 1000 0100)  // 부호 바꾸고 이진수값에 +1
		System.out.printf("~ 연산결과 : %d \n", result);   // 10 = 0000 1010 (-10 = 1000 1011)
		
		result = ~3;
		System.out.println(result);
				
		// 0 0 0 0 1 0 1 0  num1 
		// 0 0 0 0 0 1 0 1  num2
		// 0 0 0 0 0 0 0 0  &(논리곱)
		// 0 0 0 0 1 1 1 1  |(논리합)
		// 0 0 0 0 1 1 1 1  ^(같은숫자면 0, 다른숫자면 1)
	
		// >>, >>>, << (비트연산자)
		result = num1 >> 2;
		System.out.printf(">> 연산결과 : %d \n", result);  // 0000 1010 >>2  0000 0010
		
		//&&, ||, ! (논리연산자, boolean형태의 값들)
		boolean b1 = false;
		boolean b2 = !b1;
		
		boolean b3 = b1 && b2;   //  %% (and)
		boolean b4 = b1 || b2;   //  || (or)

		System.out.printf("b4 : %s, b3 : %s, b1 : %s, b2 : %s \n", b4, b3, b1, b2);
		
		
		
		
	}

}
