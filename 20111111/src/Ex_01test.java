
public class Ex_01test {
	public static void main(String[]args) {
		Ex_01 ex01 = new Ex_01();
		Ex_01 ex02 = new Ex_01();
		
		if (ex01 == ex02){
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
			}
		ex01.first = 20;
		ex01=ex02; // ex02�� �ּҸ� ex01�� ������ ����Ű�� �Ѵ�. 
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		if (ex01 == ex02){
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
			}
		ex02.first = 30;
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		
		
		
		Singleton s1 = Singleton.getInstance() ;  // �ּ� ������ �����
		Singleton s2 = Singleton.getInstance() ;  // ���� �ּ� ������ �����
		// 20111111_2 �޸��� ���� (5������) 
		if (s1==s2) {
			System.out.println("s1�� s2�� ���� �ּҸ� ����Ѵ�.");
		}else {
			System.out.println("�ٸ���.");
		}
		
	}
}
	

