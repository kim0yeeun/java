
public class Ex_10 {

	public static void main(String[] args) {
		int []i1 = {1,2,3,4}; //i[0]
		//			0 1 2 3
		int []i2 = {5,6,7}; // i[1]
		//			0 1 2  
		int []i3 = {8,9,10,11,12,13}; //i[2]
		//			0 1 2  3  4  5
		int i[][] = new int[3][];
		
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		
		// System.out.println(i[1][3]);  ������ �߻��Ѵ�.
		// �ε��� ũ�⿡ �°� ����ؾ��Ѵ�.
		
		System.out.println(i[2][5]);
		
		int[][] ii = new int[3][];
		ii[0] = new int[4];
		ii[1] = new int[3];
		ii[2] = new int[5];
		ii[0][0] = 1; ii[0][1] = 2; ii[0][2] = 3; ii[0][3] = 4;
		ii[1][0] = 5; ii[1][1] = 6; ii[1][2] = 7; 
		ii[2][0] = 8; ii[2][1] = 9; ii[2][2] = 10; ii[2][3] = 11; ii[2][4] = 12;

		System.out.println("=====");
		
		int [][]iii = new int [3][4];
		iii[0][0]=1;iii[0][1]=2;iii[0][2]=3;iii[0][3]=4;
		iii[1][0]=5;iii[1][1]=6;iii[1][2]=7;iii[1][3]=8;
		iii[2][0]=9;iii[2][1]=10;iii[2][2]=11;iii[2][3]=12;
		
		System.out.println("=====");
		
		int x[] = new int[3];	// ũ�⸦ ������ �迭���� �Ǵ� 
		int y[] = {1,2,3,4}; 	// ����� ���ÿ� �ʱⰪ�� �ش�. 
		
		System.out.println("=====");
		
		int z[][] = {{1,2,3,4},{5,6,7},{8,9,10,11,12}};
		System.out.println(z[2][4]);
		
		// z �� �迭�� ���� ��ҹ�ȣ�� ���� ����ϼ���. z[0][1]=2
		for (int j=0;j<3;j++) {
			for (int k = 0; k< z[j].length;k++) {
				System.out.println("z["+j+"]["+k+"]="+z[j][k]);
			}
		}
		
		
		
		
	}
}