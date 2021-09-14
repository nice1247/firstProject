package firstProject;
// firstProject.ScannerExample
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요...");
		String name = scn.nextLine(); // 홍길동 Enter.
		System.out.println("나이를 입력하세요...");
		int age = scn.nextInt(); // 20 Enter.              //왜 nextline안쓰고 nextint ????    int는 안먹힘 !
		scn.nextLine();  // enter키에 해당
		System.out.println("취미를 입력하세요...");
		String hobby = scn.nextLine();
		
		System.out.println("[입력한 값]");
		System.out.printf("이름 : %s, 나이 : %d, 취미 : %s %n", name, age, hobby);
		
	}

}
