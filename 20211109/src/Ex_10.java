
public class Ex_10 {
	
	String company;
	String model;
	String color;
	int maxSpeed;

	public Ex_10() {}

	public Ex_10(String company, String model, String color) {
		this(company,model); // ������ ����ʵ� �ʱ�ȭ���� �ʾƵ�, �ʱ�ȭ �� �����ڸ� this�޼��带 �̿��ؼ� �ʱ�ȭ��ų �� �ִ�. 
							 // �Ʒ� �ּ� �� ����� ���� �ڵ��̴�. 
//		this.company = company; // ���� �ڵ�
//		this.model = model; // ���� �ڵ�
		this.color = color;
	}
	
	public Ex_10(String company, String model, int maxSpeed) {
		this(company,model); // ���� �ڵ�
		this.maxSpeed = maxSpeed;
	}
	
// �ءء� this() �޼���� ���Ǵ� �����ڴ� �Ʒ��� ����� �ִ� ���� ����. 
// 		���� �ڵ带 �����ϱ����� ������ 
	public Ex_10(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
}
/* this(height) : �ٸ� ������ ȣ���� �ǹ�
 * this.height : ����ʵ�
 * this.height = height���� �� ��° this���� height : �Ű�����
 */




