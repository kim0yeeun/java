import java.util.Random;

public class Ex_04 {

	public static void main(String[] args) {
		// �迭�� ũ�� (�迭��.length)
		int i[]=new int[] {1,2,3,4,5};
		// 				   0 1 2 3 4 
		System.out.println(i.length);
		int sum = 0;
		for (int j=0; j<i.length;j++) {
			sum+=i[j];
		}
		System.out.println(sum);
		
		// ���� ũ�Ⱑ 10�� �迭�� ����� Math.random�� ����ؼ�
		// �迭�� ������ ���� �����ϼ���. (for�� ���)

		int x[]=new int[10];
		for(int num=0;num<x.length;num++) {
			x[num]=(int)(Math.random()*100)+1;
		} // k�� 0���� 9���� ������ ���� �����Ѵ�. 
		
		sum=0;
		for(int num=0;num<x.length;num++) {
			System.out.println(x[num]);
			sum+=x[num];
		}
		System.out.println(sum);
	
	}

}
