public class Ex_06 {
	public static void main(String[]args) {
		short sh1 = 32767;
		short sh2 = 32767;
		int sh3 = sh1 + sh2; // short->int �ڵ�����ȯ
		//        ���� + ����
		//        4byte + 4byte = 4byte
		System.out.println(sh3);
		
		short sh4 = 10;
		short sh5 = 20;
		// short sh6 = sh4 + sh5;
		int sh6 = sh4 + sh5;
		System.out.println(sh6);
		
		short sh7 = (short)(sh4 + sh5);
		// ��������ȯ 
		// sh7 = (short)sh4 + (short)sh5;
		//       4byte -> 2byte �� �ٲ����� �����Ϸ���(+) 4byte�� �ڵ�����ȯ�� �Ͼ��.
		
		
		
		int i1 = 10;
		int i2 = 3;
		double d1 = i1 / i2;
		//          4byte / 4byte �����̹Ƿ� ������ ������ �ȴ�.
		//          10/3 = 3
		System.out.println(d1);
		d1 = (double)i1 / i2;
		//    8byte     / 4byte �̹Ƿ� �ڵ�����ȯ -> 8byte/8byte = 8byte
		System.out.println(d1);
		
		float f1 = 3.5f;
		float f2 = 3.7f;
		float f3 = f1 + f2;
		System.out.println(f3);
		double d4 = 3.8;
		//? = f1 +d4; ?�ڷ����� �����̾�� �ұ�?
		double d5 = f1 + d4;
		System.out.println(d5);
		//? = 3.5 + 4;
		double d6 = 3.5 + 4;
		
		short sh = -127;
		int ss = -sh; // --127
		System.out.println(ss);
		
		
		
		
	}

}
