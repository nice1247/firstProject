package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5]; // null, null, null, null, null
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwan" };
		System.out.println(strAry.length);

		// 배열 3번째 위치의 값을 바꾸고 싶다.
		strAry[2] = "Hong"; // ==(수), equals() (글자)
		// 같은 글자 찾기
		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("Hong"))
				System.out.println(strAry[i]);
		}
		System.out.println("==========끝1.");

		// Enhanced for
		for (String str : strAry) {
			System.out.println(str);
		}
		// 조건식, 증감식 딱히 사용 x
		int[] scores = { 50, 70, 80, 60 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		System.out.println("=======끝2.");

		// 학생 3명의 점수 4.2, 3.5, 2.8
		// 합계를 담을 수 있도록 변수.
		// 평균을 계산해서 학생평균 : 입니다.
		double sum1 = 0;
		double[] sc = { 4.2, 3.5, 2.8, 2.1 };
		for (double sco : sc) {
			sum1 += sco;
		}
		System.out.println(sum1);
		System.out.printf("학생평균 : "+ sum1 / sc.length);

	}

}
