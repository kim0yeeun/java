
public class Ex_08_3장 {
	public static void main(String [] args) {
		/* 자료형 : 
		 *  정수 : byte, char, short, int, long
		 *  실수 : float, double
		 *  문자열 
		 *  부울형 
		 */
		
		int i = -128;
		System.out.println(-i);
		int i1 = 1;
		i1 = i1 + 1;
		System.out.println(i1);
		i1 = i1 + 1;
		System.out.println(i1);
		
		
		++i1; // i1 = i1 + 1; : 선행연산
		System.out.println(i1);
		i1++; // i1 = i1 + 1; : 후행연산
		System.out.println(i1);
		
		System.out.println("====================");
		
		int x = ++i1;  // x에 대입되기 전에 연산이 일어남
		System.out.println(i1);
		System.out.println(x);
		
		int y = i1++;  // y에 대입한 후에 연산이 일어남 
		System.out.println(i1);
		System.out.println(y);
		
		System.out.println("====================");
		
		int i2 = 10;
		--i2;
		System.out.println(i2);
		i2--;
		System.out.println(i2);
		
		y = --i2; // i2 = i2 - 1;  y = i2
		System.out.println(y);
		y = i2--; // y= i2;  i2 = i2 - 1
		System.out.println(y);
		
		i1=10;
		System.out.println(++i1); 
		System.out.println(i1);
		System.out.println(i1++);
		System.out.println(i1);
		// 11 11 11 12 
		
		int i3 = 10;
		int j = 20;
		int z = ++i3 + j++;
		
		System.out.println("z = "+z);
		System.out.println("i3 = "+i3);
		System.out.println("j = "+j);
		// 31 11 21
		
		
	}

}
