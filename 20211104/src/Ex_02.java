
public class Ex_02 {
	public static void main(String [] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		
		//b = -129; �Ұ���
		//b = 128; �Ұ���
		
		char ch=0; // unicode : ������ �ش�Ǵ� ���ڴ�
		System.out.println(ch);
		ch = 65535;
		System.out.println(ch);
		ch = 65; // �빮�� A
		System.out.println(ch);
		ch = 97; // �ҹ��� = �빮�� +32
		System.out.println(ch);
		ch = 'A'+32;
		System.out.println(ch);
		// char�� ���ڸ� ��Ÿ���ִ� �ڷ����̴�. 
		// �׷��Ƿ� ���ڸ� �������� ���� x ����� ���� �ڷ����̴�.
		
		char ch1 = '��';
		System.out.println((int)ch1);
		System.out.println(ch1);
		
		short sh = -32768;
		System.out.println(sh);
		sh=32767;
		System.out.println(sh);
		// sh = -32769
		// sh =  32768
		
		float f;
		f = 3.4f;
		System.out.println(f);
		double d = 3.4; // 8����Ʈ 
		System.out.println(d);
		
		long l = 10;
		System.out.println(l);
		l = 2147483647;     // ���� ū ���ڴ� �ȵǴϱ�
 		l = 20000000000L;   // l�̳� L�� �ڿ� ���δ�. �׷� 8����Ʈ 
		System.out.println(l);
		// ������ �⺻ũ��� 4����Ʈ
		// �Ǽ��� �⺻ũ��� 8����Ʈ 
	
		
	}

}
