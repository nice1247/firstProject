package control;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 50;

		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 그외 F
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점"); // else 딱히 조건 안넣어도 돼
		}

		System.out.println("끝.");
	}

}



/// ctrl shift f - 줄맞춤