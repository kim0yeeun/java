
public class Ex_11 {

	public static void main(String[] args) {
		// 4�� 5��¥�� �迭�� ���� Math.random()�� �̿��Ͽ� ���� �����ϼ���.
		// ������ 1~100������ ��
		
		int i[][]=new int[4][5];
		int row=0;
		while(row<i.length) {
			int col=0;
			while (col<i[row].length) {
				i[row][col] = (int)(Math.random()*100)+1;
				col++;
			}
			row++;
		}
		
		for (row=0;row<i.length ;row++) {
			for(int col=0;col<i[row].length;col++) {
				System.out.println("i["+row+"]["+col+"]="+i[row][col]);
			}
		}
		

		System.out.println(i[2][3]);
		
	}

}
