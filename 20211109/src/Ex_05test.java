
public class Ex_05test {

	public static void main(String[] args) {
		Ex_05 ex05 = new Ex_05();
//		// ���� ����� ������ ���� ����. 
		// = ����� ����
//		ex05.age = 20;
//		ex05.height = 169.5;
		
		// ����� �����ϱ� ���ؼ��� �Լ��� ����ؾ� �Ѵ�. 
		ex05.setAge(30);
		ex05.setHeight(169.6);
		
		//System.out.println(ex05.age);
		System.out.println(ex05.getAge());
		
		ex05.setName("�����"); 							//?????????????????????????
		System.out.println(ex05.name);	
		
	}

}
