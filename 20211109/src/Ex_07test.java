
public class Ex_07test {

	public static void main(String[] args) {
		// Ex_7 ex07 = new ������ 
		Ex_07 ex07 = new Ex_07(20,10);
		ex07.add();
		System.out.println(ex07.getResult());
		
		
		//�ʱ�ȭ�� ���� �ʰ� get�ؼ� �� �����ϰ� �ʹٸ�? �Ű������� ���� �����ڸ� ������
		
		Ex_07 ex07_1 = new Ex_07(); // ����Ʈ������ default
		ex07.setFirst(100);
		ex07.setSecond(50);
		
		
		Ex_07 ex07_2 = new Ex_07(); // ����Ʈ ������ ���� 
		ex07_2.setFirst(30);
		System.out.println(ex07_2.getFirst());
		
		

	}

}
