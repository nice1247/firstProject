package firstProject;

public class VariableExample {
	public static void main(String[] args) {
		int number1 = 10; // ���� <--> ���
		System.out.println("��� : " + number1);
		number1 = 20;
		System.out.println("��� : " + number1);
		number1 = 30;
		System.out.println("��� : " + number1);
		
//		int number1 = 90; ���� ���������ؼ� ����
		int number3 = 90;
		int result;
//		int-����, double-�Ǽ�
		
		final int number2 = 20;
//		number2 = 30; �̰� ����̱� ������ ����
		
		result = number1 + number2;
		double result1 = number3 / 20.0; // int/int = int, int/double = double
// byte < short < int < long < float < double (ū Ÿ������ ���)
		
		System.out.println("����� : " + result1);
		System.out.println("����� : " + result);
		System.out.println("��� : " + number1 + number2);
		
	}

}
