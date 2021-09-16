package reference;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// 학생정보를 입력해서 점수분석.
		// 학생인원 지정, 학생점수, 전체점수리스트,분석:평균, 최고점, 종료
		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("번호를 선택하세요>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];

			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);

			} else if (choice == 5) {
				break;
			}

		}
		System.out.println("끝.");
	}

	public static void showMenu() {
		System.out.println("1: 학생인원 지정, 2: 학생점수입력, 3: 전체리스트, 4: 분석:평균, 최고점, 5.종료");
	}

	public static int createStudent() {
		int cnt = readInt("학생 수를 입력하세요.");
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if(ary == null) {
			System.out.println("1번을 먼저 입력해주세요.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readInt("학생점수를 입력하세요.");
		}

	}

	public static void showList(int[] ary) {
		if(ary == null) {
			System.out.println("1번을 먼저 입력해주세요.");
			return;
		}
//		if(ary[i] == 0) {								>>>>> ary 안의 값이 0 일때 돌아가게 만들어보자
//			System.out.println("2번으로 돌아가 입력해주세요.");
//			return;
//		}
		for (int i = 0; i < ary.length; i++) {
			// scores[0] => 88
			System.out.printf("scores[%d] => %d\n", i, ary[i]);
		}

	}

	public static void analysis(int[] ary) {
		// 평균, 최고점 => 콘솔.
		int sum = 0;
		double avg = 0;
		int maxVal = 0;

		for (int score : ary) {
			sum += score;
			maxVal = maxVal < score ? score : maxVal;

		}
		avg = (double) sum / ary.length;

		System.out.printf("평균 : %f, 최고점 : %d\n", avg, maxVal);
	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}

}
