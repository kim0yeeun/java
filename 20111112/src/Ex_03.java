
public class Ex_03 extends Ex_02{ // �ڽ�Ŭ���� 
	String subject;
	public Ex_03 (int radius, double pi, String subject) {
		super(radius,pi);
		this.subject = subject;
	} // �θ�Ŭ������ �����ڰ� �ִٸ� �ڽ�Ŭ�������� �����ڰ� �־�� �Ѵ�.
	  // �Ű������� �θ�Ŭ������ �͵� �⺻ + �ڽ�Ŭ���� 
	
	@Override
	public double area() { // ������ 
		return radius * radius * Math.PI;
	}
	public double area(double p) {	// ���� �̸��� �Լ����� �Ű������� ������ Ÿ���� �ٸ��� �����ε� �Ǿ� ���� �� �ִ�. 
		return radius * radius * pi;
	}
	
	public double area1() {
		return super.area(); // �θ� ���� area() �� �ٽ� ����ϰڴٴ� �ǹ� 
	}

}
