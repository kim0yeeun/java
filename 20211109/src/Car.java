
public class Car {
	// ȸ��, ��, ��, ���ǵ�
	String company;
	String model;
	String color;
	int maxSpeed;
	// ������ ����� : ��Ʈ ����Ʈ ���� �� -> ���׷���Ʈ 
	public Car() {}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// �޼��� ����� : ��Ʈ ����Ʈ ���� �� -> ���׷���Ʈ
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	

}
