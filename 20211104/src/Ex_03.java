
public class Ex_03 {
	public static void main(String[]args) {
		int i = 10;
		System.out.println(i);
		// i="10"; ���ڿ� 
		String str = "10"; // ���ڿ� : ""
		System.out.println(str);
		
		// char ch = '10'; ���ڰ� �ƴ϶� ���ڿ��̵� (1���� 0���ڰ� �������ִ� ���� )
		char ch = '0'; // ���� : ''
		System.out.println(ch);
		ch = '9';
		System.out.println(ch);
		ch = 0;				// ���鹮��
		System.out.println(ch);
		ch = '0'; 			// 48�� ���� ���� 
		System.out.println(ch);
		System.out.println((int)ch);
		
		// String str = 'a';  // �ȵ�!
		
		char ch1 = 'a';
		// char ch1 = "a"; ""�� �ϸ� ���ڿ��� ����ؼ� ���� �� ����.
	}
}
