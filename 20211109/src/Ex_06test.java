
public class Ex_06test {

	public static void main(String[] args) {
	
		Ex_06 ex06 = new Ex_06(); // ��ü ���� 
		// ��� �ʵ��� �ʱ�ȭ 
		ex06.setData("�̼���", 30, 187.4);
		String name = ex06.getName();
		System.out.println(name);
		

		// ��ü ������ ���ÿ� ��� �ʵ��� �ʱ�ȭ�� �Ϸ���? ������ ��� 
		// Ex_06_1 ex06_1 = new Ex_06_1(); �������̹Ƿ� �� ����Ѵ�. -> �޴��ʿ����� void���� 
	
		Ex_06_1 ex06_1 = new Ex_06_1("�̻��", 17, 175.4);
		// ��ü�����ÿ� �����ڰ� �ڵ����� ����ȴ�. 
		System.out.println(ex06_1.getAge());
		
	}

}
