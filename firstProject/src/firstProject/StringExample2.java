package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "������";
		int age = 25;
		
		// �̸��� ������, ���̴� 25
		System.out.println("�̸��� " + name +", ���̴� " +  age);
		System.out.printf("�̸��� %s, ���̴� %d %n", name, age);
		
		byte b1 = 90;
		byte b2 = 10;
		int result = b1 + b2;
		System.out.println(b1 +" + "+ b2 +" = "+ result);
		System.out.printf("%s + %s = %s %n", b1, b2, result);
		
		boolean isLarger;
		b1 = -90;
		result = b1 + b2;
		isLarger = result > 0;
		
		if (isLarger) {
			System.out.println("����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�."); 
		}
		
//		Long 2200000000, 120, 16
		// avg, 120�� 16���� ���� ��� : 7.5
		Long l1 = 220000000L;
		int a = 120;
		int b = 16;
		double avg = (double) a/b;
		System.out.println(avg);
		
		a = 78;
		avg = (float) a/b;
		System.out.println(avg);
		
		b = 8;
		long avg1 = (l1 + a + b) /3 ;
		System.out.println(avg1);
		
		avg = (l1 + a + b) /3 ;
		System.out.println(avg);
		
		
	}

}
