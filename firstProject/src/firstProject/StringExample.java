package firstProject;

public class StringExample {
	
	public static void main(String[] args) {
		int age = 20;
		String name = "ȫ�浿";
		
		long myAge = age; // �ڵ�����ȯ (promotion) (���� ������Ÿ�Կ��� ū ������Ÿ������ �ٲ� ��)
		age = (int) myAge; // ��������ȯ (casting)	
	
		// age = "ȫ�浿"; 
		// name = 20;  ������Ÿ���� �޶� ����
		System.out.println(name + "�� ���̴� " + age);
		
		String names = "������";
		int ages = 100;
		System.out.println(names + "�� ���̴� " + ages + "�Դϴ�.");
		//
	}

}
