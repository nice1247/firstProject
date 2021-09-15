package control;

public class OhJaeJun {
	public static void main(String[] args) {
		// if for (while) break continue를 사용하여
		// 뭘 만들지 생각하여 만들어보기

		int roll = 0;
		int sum = 0;
		if (roll <= 6) {
			for (int i = 1; i <= 6; i++) {
				int dice = (int) (Math.random() * 10) + 1;
				System.out.println(dice);
				sum += dice;
				roll++;
			}
		}
		System.out.printf("총 간 거리 : %d, 굴린 횟수 : %d", sum, roll);

	}
}
