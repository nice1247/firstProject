package control;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1; // 초기식. // while 조건은 T,F가 적절
		while (i <= 10) {
			System.out.printf("i의 값은 %d\n", i);
			i++;
		} // >> for 구문이 더 적절

		boolean run = true;
		int cnt = 0;
		while (run) {
			cnt = (int) (Math.random() * 10) + 1;
			System.out.println(cnt);
			if (cnt == 8) {
				run = false;
			}
		} // >> 몇번 시행해야 될 지 모를 때 더 적절, random - while이랑 잘 어울려

		int cnt1 = 0;
		while (true) {
			cnt1 = (int) (Math.random() * 10) + 1;
			System.out.println(cnt1);
			if (cnt1 == 6) {
				break;

			}
			System.out.println("====꿑.");

		}
	}
}
