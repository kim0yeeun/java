
public class Ex_04 {

	public static void main(String[] args) {
		// �迭�� ũ�� (�迭��.length)
		int i [] = new int[] {1,2,3,4,5};
		//                    0 1 2 3 4
		System.out.println(i.length); // 5
		// �迭�� �ִ� ���� �հ踦 ���Ͻÿ�.
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		// ũ�Ⱑ 10�� �迭�� ����� Math.random�� �̿��Ͽ� 
		// �迭�� ������ ���� �����Ͻÿ�. for�� ���
		// ���� ���� 1 ~ 100
		int j[] = new int[10];
		for(int k = 0; k < j.length ; k++) {
			j[k] = (int)(Math.random() * 100 ) + 1;
		}// k �� 0���� 9���� ������ ���� ���� 
		/* j[0] = (int)(Math.random() * 100 ) + 1;
		 * j[1] = (int)(Math.random() * 100 ) + 1;
		 * j[2] = (int)(Math.random() * 100 ) + 1;
		 * ...
		 * j[9] = (int)(Math.random() * 100 ) + 1;
		 */
		sum = 0;
		for(int k = 0; k < j.length ; k++) {
			System.out.println(j[k]);
			sum += j[k];
		}
		System.out.println(sum);
		

		

	}

}