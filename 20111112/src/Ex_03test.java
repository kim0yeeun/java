
public class Ex_03test {

	public static void main(String[] args) {
		Ex_03 ex03 = new Ex_03(3, 3.141592, "�׽�Ʈ1");
		System.out.println(ex03.subject);
		double d = ex03.area(); // �������̵� area
		System.out.println(d);
		d = ex03.area(Math.PI); // �����ε� area
		System.out.println(d);
		System.out.println(Math.PI);
		d = ex03.area1(); // �θ� ������ �ִ� area 
		System.out.println(d);
	}

}
