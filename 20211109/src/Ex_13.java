
public class Ex_13 {
	int result;
	int first;
	int second;
	int add; // ����
	public Ex_13(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// �޼����� 4���� ����
	// 1.  �Է� ���� �ְ� �����(��ȯ��)�� �ִ� �޼���
	public int add(int num1, int num2) {
		return  num1 + num2;
	}
	// �޼��� �����ε�
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	// 2. �Է°��� �ְ� �����(��ȯ��)�� ���� �޼���
	public void sub(double num1, int num2) {
		this.result = (int)num1 - num2;
		System.out.println(this.result);
	}
	// �޼��� �����ε�  // �Ű������� ������ �ٸ���.
	public int sub(int num1, double num2) {
		return num1 - (int)num2 ;
	}
	// 3. �Է°��� ���� ������� �ִ� �޼���
	public int mul() {
		return first * second;
	}
	// 4. �Է°��� ���� ������� ���� �Լ�
	public void div() {
		System.out.println(this.first / this.second );
	}
}
	// this.first = first
	// ����ʵ�� �Ű������� ������ this������ �ٿ����ϰ�
	// public dd(int a, int b){
	//		first = a; 	�ٸ��� �� �ٿ��� �Ǳ� �Ϥ��� ���� �̸����Ƽ� ����  

