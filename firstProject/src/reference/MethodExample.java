package reference;

public class MethodExample {
	public static void main(String[] args) {
//		 �񸸵� ������.
//		double bmi = weight / (height * height);
//		bmi < 18.5 ��ü��.
//		18.5~23 ����.
//		23~25 ��ü��.
//		25~ 30 ��.. ����.  
//		 ctrl + / �ѹ��� ���� !
		
		double w1 = 72.4, h1 = 1.75;
		checkBMI(w1, h1); // �޼ҵ� ����.
		double w2 = 65.7, h2 = 1.63;
		checkBMI(w2, h2);
		checkBMI(65.8, 1.73);
		
	}
//		�޼ҵ带 ������ ��
	public static void checkBMI(double weight, double height) {
		// method(�Ű�����)
		
		double bmi = weight / (height * height);
		if (bmi > 18.5) {
			System.out.println("��ü��.");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("����.");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("��ü��.");
		} else if (bmi >= 25) {
			System.out.println("��.");
		} else {
			System.out.println("�ǻ�� ����ϼ���.");
		}
	}

}
