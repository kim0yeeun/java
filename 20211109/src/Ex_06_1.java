
public class Ex_06_1 {

	String name;
	int age;
	double height;
	/// �ڹٿ����� �����ڸ� Ŭ���� �̸��� ���� �������Ѵ�. 
	// ������
	
	public Ex_06_1(String name, int age, double height) { // void�� ��������Ѵ�. 
														  // ��ȯ�� (void : ��ȯ�� �� ����. )
		this.age = age;
		this.height = height;
		this.name = name;
		System.out.println("������ ����");
	}
	
//  �޼��� : ���������� ��ȯ�� �Լ��� (�Ű�����) 
	
//  ���������� ��ȯ�� �Լ��� (�Ű�����) 
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge () {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
}
