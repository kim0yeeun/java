package inheritance;

public class Ex_09 extends Ex_08{
	int val;
	// �θ�Ŭ������ �����ڰ� �ִٸ� ����� ��, �ڽ�Ŭ������ super �ؼ� �ʱⰪ�� ��� �Ѵ�. 
	public Ex_09(int first, int second,int val) {
		super(first, second);
		this.val = val; // 08 ���ִ°� �Ҷ��� super�� �ƴ϶� this�� �ָ� ��
	}
	// public Ex_09 () {} ����Ʈ �����ڸ� ����� ������.
	// �θ� Ŭ������ ���� �������ֱ� ���� �����ڸ� ����ϱ� �����̴�. 
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	
	///// �θ� ���� �޼��带 ������ : �������̵� 
	/// �׷� main���� ȣ���� ��� �ڽĿ��� �������̵��� �Լ��� ���ȴ�. 
	@Override // �������̵� �� ������� ǥ�� @ : ������̼� 
	public void div() {
		if (second == 0 ) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			result = first / second;
		}	
	}
	public void div1() {
		super.div(); // �̷��� �θ� ���� div�� �״�� ����� �� �ִ�. 
	}

	

}
