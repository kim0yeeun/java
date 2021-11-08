
public class Ex_01 {
	public static void main(String[]args) {
		
		// 배열
		
		
		int [] score= {1,2,3,4,5,6,7,8,9,10};
		// 인덱스        0 1 2 3 4 5 6 7 8 9
		System.out.println(score[5]);
		
		// python의 리스트는 여러개의 유형의 데이터를 여러개 저장할 수 있다.
		// java에서의 배열은 하나의 자료형의 데이터를 여러개 저장할 수 있다. 
		
		double [] d= {10.5, 10.5, 11.8, 12.6};
		// 배열을 저장할 때에는 indexing을 한다.
		System.out.println(d[3]);
		// 배열의 모든 데이터 출력
		for (int i=0;i<=3;i++) {
			System.out.println(d[i]);
		}
		
		
	}
}
