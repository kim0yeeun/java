
public class Ex_01test1 {

	public static void main(String[] args) {
		Ex_01 ex01 = new Ex_01();		     // stack    				heap
		Ex_01 ex02 = ex01;		    //ex01		10000			10000 |first|second|
							    	//ex02		10000			
		Ex_01 ex03 = new Ex_01();	//ex03		20000			20000 |first|second|
		
		ex01.first = 30;
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		System.out.println(ex03.first);
		
		if (ex01==ex02) {
			System.out.println("ex01�� ex02�� ���� ��ü�̴�.");
		}else {
			System.out.println("ex01�� ex02�� �ٸ� ��ü�̴�.");
		}
		if (ex01==ex03) {
			System.out.println("ex01�� ex03�� ���� ��ü�̴�..");
		}else {
			System.out.println("ex01�� ex03�� �ٸ� ��ü�̴�.");
		}
		// int result = Singleton.val; // ���� ���� (�ܺο����� ����) �ϰ� ������ private�� ������ 
		int result = Singleton.val_1;
		System.out.println(result);
		
		Singleton s1 = Singleton.getInstance(); // s1 = 30000���� (�̱����ּ�)
		Singleton s2 = Singleton.getInstance(); // s2 = 30000����
		
		if (s1==s2) {
			System.out.println("s1�� s2�� ���� ��ü�̴�.");
		}else {
			System.out.println("�ٸ���.");
		}
 			
	}
}
