
public class Ex_05_����ȯ {
	public static void main(String[]args) {
		// ����ȯ
		
		// 1.�ڵ�����ȯ : ���� �ڷ����� ū �ڷ������� ��ȯ�ϴ� ��
		//		1byte -> 2byte -> 4byte -> 8byte
		//		1byte -> 8byte, 1byte-> 4byte
		// 		���� -> �Ǽ� 
		
		short sh = 30000;
		int i = sh; // �ڵ�����ȯ
		float f = sh; // 
		System.out.println(i);
		System.out.println(f);
		double d = sh;
		System.out.println(d);
		// 2.��������ȯ : ū �ڷ����� ���� �ڷ������� ��ȯ�ϴ� �� 
		//		�Ǽ� -> ���� 
		double d1 = 174.5;
		float f1 = 174.5f;
		int i1 = (int)f1;
		System.out.println(i1);
		i1=(int)d1;
		System.out.println(i1);
		int i2 = 2100000000;
		short sh1 = (short)i2; // ū��->������
		System.out.println(sh1);
		// �����÷ο찡 �߻��ؼ� ���� �޶��� �� �ִ�.
		int i3 = 32000;
		short sh2 = (short)i3;
		System.out.println(sh2);
		// �����÷ο찡 �߻����� �ʴ´�. 
		
		
	
		
		
		
		
	}

}
