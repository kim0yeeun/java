
public class Ex_12 {
	public static void main (String[]args) {
		// 6�� ���
		for (int i = 1; i <= 9; i++) {
			System.out.println("6*"+i+"="+6*i);
		}
		// 8�� ��� 
		for (int i = 1; i <= 9; i++) {
			System.out.println("8*"+i+"="+8*i);
		}
		
		gugu(3);  // argument ���� 
		gugu(5);
		System.out.println(add(1,5));
		System.out.println(add(10,72));
		int result = add(20,4);
		System.out.println(result);
		int result1 = add(20,6);
		System.out.println(result1);
		// ������ ��� �����ؾ��ϴ°�? -> Ŭ���� ���� �� ������ �ҷ����� 
		
	}
	// �ݺ������� ����ϴ� �ڵ尡 ���� ��� �Լ��� �ۼ��ϸ� ���ϴ�. 
	//                           dan : parameter �Ű�����
	public static void gugu (int dan) {
		for (int i = 1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	public static int add (int a, int b) {
		return a+b;
	}
	
	
	

}
