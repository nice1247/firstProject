package control;

public class review_915 {
	public static void main(String[] args) {
		// 연산자 * / + - %
		// & | ^ ~
		// >> << >>>
		// && || !
		// += -= *= /= ...

		// 조건문 if, else if, else
		// if(조건) {
		// 조건 맞으면 뭘 해 줄것인가
		//
		int num = 24;
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("6의 배수");
		} else if (num % 2 == 0) {
			System.out.println("2의 배수");
		} else if (num % 3 == 0) {
			System.out.println("3의 배수");
		}
		System.out.println("==============if else if");

		// 조건문 switch - case - break
		// switch(변수) - case 변수결과 :

		int num1 = (int) (Math.random() * 10) + 1;
		switch (num1) {
		case 1, 2, 3:
			System.out.println("순위권");
			break;
		case 4, 5, 6, 7:
			System.out.println("노력권");
			break;
		case 8, 9, 10:
			System.out.println("out");
			break;

		}
		System.out.println("===========switch");

		// 반복문 for(변수설정; 조건; 조건2)
		// 조건 , 출력

		int num2 = 0;
		for (int a = 1; a <= 10; a += 2) {
			num2++;
			System.out.printf("순서 : %d a : %d\n", num2, a);
		}
		System.out.println("============for");

		// 반복문 while(true or false)
		// while(조건) 으로 해서 for 구문처럼 사용가능
		// 몇 번 시행해야 될 지 모르는 반복문들에 유용

		while (true) {
			int a = (int) (Math.random() * 10) + 1;
			if (a >= 8) {
				System.out.println(a);
				break;
			}
		}
		System.out.println("============while");
		
		// while은 첫줄부터 false이면 아래 확인 안함
		// do while은 while에서 검증하기 때문에 첫문장이 틀려도 한줄은 나옴
		
		int i=1;
		do {
			
		} while(true);
		
		

	}
}