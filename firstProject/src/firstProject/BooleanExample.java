package firstProject;

public class BooleanExample {

	public static void main(String[] args) {
		boolean isOk = true;
		//isOk = false;
		isOk = 15 > 10;
		
		boolean isTeenager = false;
		
		if(isOk) { // false���̶� �������
			isTeenager = true; 
		}
		
		if(isTeenager) {
			System.out.println("û�ҳ��Դϴ�.");
		}
		System.out.println("end of prog");
	}
}

// boolean - true or false , ���ǹ� if�� ���� ���