package inheritance;

public class Ex_08test {

	public static void main(String[] args) {
		Ex_09 ex09 = new Ex_09(30,10,15);
		ex09.add();
		System.out.println(ex09.getResult());
		ex09.div();
		System.out.println(ex09.getResult());
		ex09.sub();
		System.out.println(ex09.getResult());

		
		
		
		System.out.println("=====");
		
		Ex_09 ex090 = new Ex_09(0, 10, 15); // ���ڿ� 0
		ex090.div();
		System.out.println(ex090.getResult());
		
		Ex_09 ex091 = new Ex_09(10, 0, 15); // �и� 0 
		ex091.div(); // exception �ɸ���. �׷��� �ٲٰ�ʹٸ�? �ڽ�Ŭ�������� �������̵��� ����.
					 // �ڽ� Ŭ�������� �������� div�� ���Ǹ�, �θ� Ŭ������ div�� ��������. 
		ex091.div1(); // �θ� ������ �ִ� �޼��带 ȣ���Ѵ�.  
		

	}

}
