
public class Ex_02test {

	public static void main(String[] args) {
		int i = 10;
		Ex_02 ex02 = new Ex_02();
	//  �ڷ���  ������
	//  Ŭ����  ��������λ��� 
		ex02.addr = "�д�";
		ex02.age = 35;
		ex02.name = "�̼���";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);
		
		Ex_02 ex02_1 = new Ex_02();
		ex02_1.addr = "�д�";
		ex02_1.age = 18;
		ex02_1.name = "�̻��";
		System.out.println(ex02_1.name);
		
	
	
	}

}
