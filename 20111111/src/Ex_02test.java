
public class Ex_02test {

	public static void main(String[] args) {
		Ex_02 ex01 = new Ex_02(10,20);	// final ������ �����ڸ� ���� �ʱ�ȭ�� �� ������
		// ex01.first = 20;				   final ������ ���� ������ �� ����. 
		Ex_02 ex02 = new Ex_02(30,40);
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		
		// final ���� ������ ���� ������ instance���� ���� ������ ������� ���� �ִ�. 
	}

}
