package firstProject;

public class CharExample___ {
	public static void main(String[] args) {
		// int, String, boolean, char
		// byte(1byte) < short, char(2) < int(4) < long(8) < float < double
		char myFirstCharType = 97; // char ������ ��� Ÿ��
		
		System.out.println((int) myFirstCharType);
		System.out.println(myFirstCharType);
		
		byte b1 = 10; // 1byte(8bit) 
		// 0 0 0 0 0 0 0 0 => 1byte
		// 2*1.... 2*8 => 256���� ����� ��(-128~+127)
		// 0(��ȣ +) 0 0 0 0 0 0 0 (-128~+127)
		// 0 1 1 1 1 1 1 1 (+127) +1 => 1 0 0 0 0 0 0 0 (-128)
		//
		b1 = 127;
		b1++; // b1 = b1 + 1;
		System.out.println(b1);
		// 127�̻� �ȵǳ� ? > byteŸ���̴ϱ�
		
		short s1 = 0; // -128 + 0
		// short -32768 ~ 32767
		//short result = b1 + s1; 
		//short + short = short, +�����ڰ� int�� �������� ���
		short result = (short)(b1 + s1);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(result);
		
		long fakeLong = 2147483648L; // 2147483647���� �ν� 2147483648���ʹ� LŸ���Է�
		
	}

}
