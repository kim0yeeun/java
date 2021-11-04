
public class Ex_03 {
	public static void main(String[]args) {
		int i = 10;
		System.out.println(i);
		// i="10"; 문자열 
		String str = "10"; // 문자열 : ""
		System.out.println(str);
		
		// char ch = '10'; 문자가 아니라 문자열이됨 (1문자 0문자가 합쳐져있는 상태 )
		char ch = '0'; // 문자 : ''
		System.out.println(ch);
		ch = '9';
		System.out.println(ch);
		ch = 0;				// 공백문자
		System.out.println(ch);
		ch = '0'; 			// 48을 갖는 문자 
		System.out.println(ch);
		System.out.println((int)ch);
		
		// String str = 'a';  // 안돼!
		
		char ch1 = 'a';
		// char ch1 = "a"; ""로 하면 문자열로 취급해서 넣을 수 없다.
	}
}
