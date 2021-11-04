
public class Ex_10 {
	public static void main(String[]args) {
		// 대입연산자 : = 
		int i = 10;
		System.out.println(i);
		i+=1;
		System.out.println(i);
		i-=1;
		System.out.println(i);
		i*=1;
		i/=1;
		i%=1;
		// + - * / % 전부 다 사용 가능
		
		int a,b,c;
		a=b=c=100;
		String str ="hello"+"java";
		String str1="hello";
		String str2="java";
		str=str1+str2;
		System.out.println(str);
		System.out.println ("a,b,c는" + 100);
		
		
		str="3*7="+21; // 숫자가 문자열로 자동형변환
		System.out.println(str); 
		
		// 삼항연산자 
		i=70;
		System.out.println(i>60?"합격":"불합격"); // if문과 같다 
	}

}
