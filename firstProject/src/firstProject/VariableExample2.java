package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// �̸�, ����, ��/����
		int age = 25;
		int ages = 31;
		String name = "������";
		boolean truth;
		truth = age <= ages;
				
		// age <= ���� => �̸��� 25�� �̻�.
		
		// age >= ���� => �̸��� 25�� ����.
		
		if(truth) {
			System.out.println(name + "�� " + age + "�� �̻��Դϴ�.");
		}
		
		truth = age>=ages;
		if(truth) {
			System.out.println(name + "�� " + age + "�� �����Դϴ�.");
		}
	
		
		System.out.println("end of program.");
	}

}
