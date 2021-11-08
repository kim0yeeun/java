import java.util.Random;

public class Ex_04 {

	public static void main(String[] args) {
		// 배열의 크기 (배열명.length)
		int i[]=new int[] {1,2,3,4,5};
		// 				   0 1 2 3 4 
		System.out.println(i.length);
		int sum = 0;
		for (int j=0; j<i.length;j++) {
			sum+=i[j];
		}
		System.out.println(sum);
		
		// 문제 크기가 10인 배열을 만들고 Math.random을 사용해서
		// 배열에 임의의 값을 저장하세요. (for문 사용)

		int x[]=new int[10];
		for(int num=0;num<x.length;num++) {
			x[num]=(int)(Math.random()*100)+1;
		} // k가 0부터 9까지 임의의 값을 저장한다. 
		
		sum=0;
		for(int num=0;num<x.length;num++) {
			System.out.println(x[num]);
			sum+=x[num];
		}
		System.out.println(sum);
	
	}

}
