
public class Ex_13 {

	public static void main(String[] args) {
		// 3��4���� 2���� �迭�� 1~100���� ����ϴ� Math.random()�� �̿��Ͽ� 
		// ���� ������ �Ŀ� �հ踦 ����ϼ���.
		
		int arr[][]=new int[3][4];
		int sum=0;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = (int)(Math.random()*100)+1;
			}
		}
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.println(arr[row][col]);
				sum+=arr[row][col];
			}
		}
		System.out.println("=====");
		System.out.println(sum);
		
		// foreach���� ����ؼ��� ���� ������ �� ���⶧���� �ݺ��� ��� 
		sum =0;
		for (int [] row : arr) {
			for (int col : row) {
				sum+= col;
			}
		}
		System.out.println("=====");
		System.out.println(sum);
		
		System.out.println("=====");
		// �հ�� ����� foreach���� ����ؼ� ���ϼ���.
		sum=0;
		int [] score = {60,89,56,73,66,90,95};
		for(int x : score) {
			sum+= x;
		}
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+sum/score.length);

	}

}
