
public class Ex_02 {
	public static void main(String[]args) {
		// �迭 �����
		// [] ������ : �迭�� �����ϱ� ���� ������ 
		int j = 10+15;
		int i [] = {10,20,30};
		int i1[]; // �迭����
		i1= new int [] {10,20,30}; // �迭 ����, ũ�Ⱑ ���������Ѵ�.
		int i2 [] = new int[3]; //�迭�� ũ��� 3�̴�.
		i2[0]=10;
		i2[1]=20;
		i2[2]=30; // 3���� ���� ����
		int i3[];
		i3 = new int[3]; // �迭�� ũ�⸦ 3���� ��
		i3[0]=10;
		i3[1]=20;
		i3[2]=30;
		System.out.println(i3[2]);
		/* ���Ұ� 
		 * int i4[];
		 * i4 = {10,20,30};
		*/
		int i5[]; 
		i5 = new int[3];
		// �迭�� �����ϸ� �� ��Ҵ� 0���� �ʱ�ȭ �ȴ�. 
		System.out.println(i5[0]);
		System.out.println(i5[1]);
		System.out.println(i5[2]);
		
//		��		
//		int y; // ������ �ڵ����� 0���� �ʱ�ȭ���� �ʴ´�. 
//		System.out.println(y); // �ʱ�ȭ���� �ʾƼ� ����
		
		
	}


}
