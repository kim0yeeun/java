
public class Ex_03 {
	int first;		// ����ʵ�
	int second;
	int result;
	
	// ��� �ʵ带 �ʱ�ȭ�ϱ� ���� ���
	// Python���� self�� Java������ this�� ���
	public void setData(int first, int second) {
		this.first = first;  // this�� ������ ����ʵ� (�Ķ���)
							 // this�� ������ �Ű����� (����)
		this.second = second;
		
	}
	// setter
	public void setFirst(int first) { // set������ ����ʵ�� ���� �� ù���ڴ� �빮�� 
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;	
	}
	// getter 
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
	
	
	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}
}
