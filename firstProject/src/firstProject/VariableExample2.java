package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// 이름, 나이, 참/거짓
		int age = 25;
		int ages = 31;
		String name = "오재준";
		boolean truth;
		truth = age <= ages;
				
		// age <= 나이 => 이름은 25세 이상.
		
		// age >= 나이 => 이름은 25세 이하.
		
		if(truth) {
			System.out.println(name + "은 " + age + "세 이상입니다.");
		}
		
		truth = age>=ages;
		if(truth) {
			System.out.println(name + "은 " + age + "세 이하입니다.");
		}
	
		
		System.out.println("end of program.");
	}

}
