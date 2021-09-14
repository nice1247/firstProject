package firstProject;

public class BooleanExample {

	public static void main(String[] args) {
		boolean isOk = true;
		//isOk = false;
		isOk = 15 > 10;
		
		boolean isTeenager = false;
		
		if(isOk) { // false값이라서 실행안함
			isTeenager = true; 
		}
		
		if(isTeenager) {
			System.out.println("청소년입니다.");
		}
		System.out.println("end of prog");
	}
}

// boolean - true or false , 조건문 if와 같이 사용