package control;

public class review_915 {
	public static void main(String[] args) {
		// ������ * / + - %
		// & | ^ ~
		// >> << >>>
		// && || !
		// += -= *= /= ...

		// ���ǹ� if, else if, else
		// if(����) {
		// ���� ������ �� �� �ٰ��ΰ�
		//
		int num = 24;
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("6�� ���");
		} else if (num % 2 == 0) {
			System.out.println("2�� ���");
		} else if (num % 3 == 0) {
			System.out.println("3�� ���");
		}
		System.out.println("==============if else if");

		// ���ǹ� switch - case - break
		// switch(����) - case ������� :

		int num1 = (int) (Math.random() * 10) + 1;
		switch (num1) {
		case 1, 2, 3:
			System.out.println("������");
			break;
		case 4, 5, 6, 7:
			System.out.println("��±�");
			break;
		case 8, 9, 10:
			System.out.println("out");
			break;

		}
		System.out.println("===========switch");

		// �ݺ��� for(��������; ����; ����2)
		// ���� , ���

		int num2 = 0;
		for (int a = 1; a <= 10; a += 2) {
			num2++;
			System.out.printf("���� : %d a : %d\n", num2, a);
		}
		System.out.println("============for");

		// �ݺ��� while(true or false)
		// while(����) ���� �ؼ� for ����ó�� ��밡��
		// �� �� �����ؾ� �� �� �𸣴� �ݺ����鿡 ����

		while (true) {
			int a = (int) (Math.random() * 10) + 1;
			if (a >= 8) {
				System.out.println(a);
				break;
			}
		}
		System.out.println("============while");
		
		// while�� ù�ٺ��� false�̸� �Ʒ� Ȯ�� ����
		// do while�� while���� �����ϱ� ������ ù������ Ʋ���� ������ ����
		
		int i=1;
		do {
			
		} while(true);
		
		

	}
}