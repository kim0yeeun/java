
public class Ex_02 {
	public static void main(String [] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		
		//b = -129; 불가능
		//b = 128; 불가능
		
		char ch=0; // unicode : 정수에 해당되는 문자는
		System.out.println(ch);
		ch = 65535;
		System.out.println(ch);
		ch = 65; // 대문자 A
		System.out.println(ch);
		ch = 97; // 소문자 = 대문자 +32
		System.out.println(ch);
		ch = 'A'+32;
		System.out.println(ch);
		// char는 문자를 나타내주는 자료형이다. 
		// 그러므로 숫자를 넣을때는 음수 x 양수만 갖는 자료형이다.
		
		char ch1 = '가';
		System.out.println((int)ch1);
		System.out.println(ch1);
		
		short sh = -32768;
		System.out.println(sh);
		sh=32767;
		System.out.println(sh);
		// sh = -32769
		// sh =  32768
		
		float f;
		f = 3.4f;
		System.out.println(f);
		double d = 3.4; // 8바이트 
		System.out.println(d);
		
		long l = 10;
		System.out.println(l);
		l = 2147483647;     // 보다 큰 숫자는 안되니까
 		l = 20000000000L;   // l이나 L을 뒤에 붙인다. 그러 8바이트 
		System.out.println(l);
		// 정수의 기본크기는 4바이트
		// 실수의 기본크기는 8바이트 
	
		
	}

}
