
public class Member {
	int age;
	double height;
	String name;
	
	// ������
	// �޼��� �����ε� : �޼��� �̸��� ������, �Ű������� Ÿ���̳� ����, ���� ���� �ٸ� �� 
	public Member() {}
	public Member(int age) {
		this.age=age;
	}
	public Member(String name) {
		this.name=name;
	}
	public Member(int age, double height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public Member(double height, int age, String name) {
		super();
		this.height=height;
		this.age=age;
		this.name=name;
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// �޼���
	
	
}
