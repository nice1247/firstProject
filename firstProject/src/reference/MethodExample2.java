package reference;

public class MethodExample2 {

	// ���� �޼ҵ�
	public static void main(String[] args) {
		sum(24, 55); // �޼ҵ� ����.
		int a = 45, b = 77;
		sum(a, b);
		multi(35, 88);
		square(3.5);
		int res = getMax(a, b);
		System.out.println("ū ���� : " + res);

		System.out.println("����� : " + divide(5, 3));

	}

	// �� ������ �Է¹޾Ƽ� �� ���� ���� console�� �����ֵ���.
	// void = return ��?? Ÿ���� ���� ?

	// ���� �޼ҵ�
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� �� : " + sum);

	}

	// �� ������ �Է¹޾Ƽ� �� ���� ���� console��
	public static void multi(int n3, int n4) {
		int multi = n3 * n4;
		System.out.println("�� ���� �� : " + multi);

	}

	// ���簢�� �ʺ� ������ִ� �޼ҵ�.
	public static void square(double n5) {
		double square = n5 * n5;
		System.out.println("���簢���� �ʺ�� " + square);
	}

	// �� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�.
	public static int getMax(int a, int b) {
		int result = (a >= b) ? a : b; // ���� ������ �� ? true : false !!!!!
		return result;
	}

	// �� ������ �Է¹޾Ƽ� ù��° / �ι�° ���� ���(��ȯ)
	public static double divide(int a, int b) {
		return (double) a / b;
	}

}
