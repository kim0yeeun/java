
public class Ex_02 { // final ����� �ʱⰪ�� �����ؾ��Ѵ�.
					 // �����ڸ� ���� �ʱⰪ�� �� �� �ִ�. 
	final int first;   // finale������ ��� �̸��� �빮�ڿ����Ѵ�... 
	final int second;
	String name;
	
	public Ex_02(int first, int second) {
		this.first = first;
		this.second = second;
	}
	/*
	 * public void setFirst(int first) {
	 * this.first = first;
	 * }
	 */ 			/// final�� ����ϸ� setter�� ���� ���� ������ ���� ����. 
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	// final�� ���� �ʱ�ȭ�� ���� ������ ���� ������ ���� �ֵ�.
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
}
	 
