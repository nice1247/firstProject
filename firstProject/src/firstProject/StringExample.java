package firstProject;

public class StringExample {
	
	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";
		
		long myAge = age; // 자동형변환 (promotion) (작은 데이터타입에서 큰 데이터타입으로 바뀔 때)
		age = (int) myAge; // 강제형변환 (casting)	
	
		// age = "홍길동"; 
		// name = 20;  데이터타입이 달라서 에러
		System.out.println(name + "의 나이는 " + age);
		
		String names = "오재준";
		int ages = 100;
		System.out.println(names + "의 나이는 " + ages + "입니다.");
		//
	}

}
