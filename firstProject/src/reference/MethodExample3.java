package reference;

// �Ȱ��� �۾��� �ݺ��ϰ� �ִ� ? �޼ҵ带 ����غ�
public class MethodExample3 {
	public static void main(String[] args) {
		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		double avg = 0;
		for (int num : intAry) {
			sum += num;
		}
		sum = sumArray(intAry);
		avg = avgArray(intAry);
		System.out.println("��1 : " + sum);
		System.out.println("���1 : " + avg);

		sum = 0;
		avg = 0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		avg = avgArray(intAry2);
		System.out.println("��2 : " + sum);
		System.out.println("���2 : " + avg);

		int[] c = { 1, 2, 3, 4, 5 };
		sum = 0;
		avg = 0;
		sum = sumArray(c);
		avg = avgArray(c);
		System.out.println(sum);
		System.out.println(avg);

	}

// �迭�� �Ű�������
	public static int sumArray(int[] d) {
		int sum = 0;
		for (int num : d) {
			sum += num;
		}
		return sum;
	}

	// �迭�� �Ű����� -> ���.
	public static int avgArray(int[] intAry2) {
		int sum = 0;
		int avg = 0;
		for (int num : intAry2) {
			sum += num;
			avg = sum / intAry2.length;
		}
		return avg;
	}

}
