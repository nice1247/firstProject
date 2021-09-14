package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "오재준";
		int age = 25;
		
		// 이름은 오재준, 나이는 25
		System.out.println("이름은 " + name +", 나이는 " +  age);
		System.out.printf("이름은 %s, 나이는 %d %n", name, age);
		
		byte b1 = 90;
		byte b2 = 10;
		int result = b1 + b2;
		System.out.println(b1 +" + "+ b2 +" = "+ result);
		System.out.printf("%s + %s = %s %n", b1, b2, result);
		
		boolean isLarger;
		b1 = -90;
		result = b1 + b2;
		isLarger = result > 0;
		
		if (isLarger) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다."); 
		}
		
//		Long 2200000000, 120, 16
		// avg, 120을 16으로 나눈 결과 : 7.5
		Long l1 = 220000000L;
		int a = 120;
		int b = 16;
		double avg = (double) a/b;
		System.out.println(avg);
		
		a = 78;
		avg = (float) a/b;
		System.out.println(avg);
		
		b = 8;
		long avg1 = (l1 + a + b) /3 ;
		System.out.println(avg1);
		
		avg = (l1 + a + b) /3 ;
		System.out.println(avg);
		
		
	}

}
