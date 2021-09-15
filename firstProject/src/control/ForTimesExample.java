package control;

public class ForTimesExample {
	public static void main(String[] args) {
		int row = 3;
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", row, i, row * i);
		}

		for (int j = 2; j <= 9; j++) {
			System.out.println("====" + j + "´Ü====");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n", j, i, j * i);
			}
		}
	}
}
