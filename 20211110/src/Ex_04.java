
public class Ex_04 { // static ���� �ʱ�ȭ ��� 
	
	static int first;
	static int second;
	// static ������ �����ڸ� �̿��ؼ� �ʱ�ȭ �� �� ����. 
	// static ������ �ʱ�ȭ �� ������ static���� �̿��Ѵ�.
	static {
		first = 10;
		second = 20;
	}
	int val;
	public Ex_04() {}
	public Ex_04(int val) {
		this.val = val;
	}
}
