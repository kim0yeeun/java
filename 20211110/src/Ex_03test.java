
public class Ex_03test {

	public static void main(String[] args) {
		Ex_03 ex031 = new Ex_03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		ex031.val1 = 3;
		
		Ex_03 ex032 = new Ex_03();
		System.out.println(ex032.first); // 0
		System.out.println(ex032.second); //0
		System.out.println(ex032.val); 
		//30 static�����̹Ƿ� class���� ��������ֱ⶧���� 8���ٿ��� 30 �����ϱ� �״�� ��µȴ�. 
		System.out.println(Ex_03.val);
		int result = ex031.add();
		System.out.println(result);   // 10 + 30 = 40 
		result = ex032.add();
		System.out.println(result);   // 0 + 30 = 40
		// static������ ��� ��ü ������ ���� �����ؼ� ����ϰ� �ȴ�.
		
		System.out.println("=====");
		
		result = Ex_03.sub(); 
		// static �޼���� Ŭ�������� �̿��ؼ� ����ؾ� �Ѵ�. instance�� ����� ���� ����. 
		// �޼��� ������ thisŰ���带 ����� �� ����. 
		
		System.out.println(result);
	}

}
