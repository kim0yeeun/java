
public class Ex_03 {
	// ���� ���� : ��� ��ü�� ���� �����ؼ� ����ϱ� ���� ���� ����
	// ���� ���� �ʱ�ȭ : static ���� �̿��ؼ� �ʱ�ȭ 
	static String name; 
	
	
	// ���
	static final int first;
	static final int second;
	
	
	// final ���� : ��ü���� ������ ���� ���� �� �ִ�.
	// final ���� �ʱ�ȭ : �����ڸ� �̿��ؼ� �ʱ�ȭ
	final int val1;
	final int val2;
	
	static {
		name = "�̼���";
		first = 10;
		second =20;
	}

	
	
	public static String getName() {
		return name;
	}

	public static int getFirst() {
		return first;
	}

	public static int getSecond() {
		return second;
	}

	public int getVal1() {
		return val1;
	}

	public int getVal2() {
		return val2;
	}

	public Ex_03(int val1, int val2) {
		this.val1=val1;
		this.val2=val2;
	}


}
