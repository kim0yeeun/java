
public class Ex_07 {

	int first;
	int second;
	int result;
	// �Ű������� �ִ� ������
	public Ex_07(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// �Ű������� ���� ������ = default ������ 
	// �����ڰ� �����ڸ� ����� ����Ʈ �����ڴ� �ڵ����� ��������� �ʴ´�. 
	// �����ڸ� ���� ��쿡�� ����Ʈ �����ڴ� ��������� ���������Ѵ�.  
	
	
	public Ex_07() {
		System.out.println("����Ʈ ������ ����");
	}
	
	// setter
	public void setFirst(int first) {
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
	public int getResult() {
		return this.result;
	}
	
	// 
	public void add() {
		this.result = this.first+this.second;
	}
	public void sub() {
		this.result = this.first-this.second;
	}
}
