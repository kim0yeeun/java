
public class Ex_01 {
	public static void main(String[]args) {
		
		// �迭
		
		
		int [] score= {1,2,3,4,5,6,7,8,9,10};
		// �ε���        0 1 2 3 4 5 6 7 8 9
		System.out.println(score[5]);
		
		// python�� ����Ʈ�� �������� ������ �����͸� ������ ������ �� �ִ�.
		// java������ �迭�� �ϳ��� �ڷ����� �����͸� ������ ������ �� �ִ�. 
		
		double [] d= {10.5, 10.5, 11.8, 12.6};
		// �迭�� ������ ������ indexing�� �Ѵ�.
		System.out.println(d[3]);
		// �迭�� ��� ������ ���
		for (int i=0;i<=3;i++) {
			System.out.println(d[i]);
		}
		
		
	}
}
