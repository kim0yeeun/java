
public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member("�̼���");
		Member m4 = new Member(10,17.5,"�̻��");
		Member m5 = new Member(175.5,20,"������");

		/*
		 * �ڵ��ۼ�
		 */
		String name = m2.getName();
		System.out.println(name);
		
		/*
		 * �ڵ��ۼ�
		 */	
		double height = m2.getHeight();
		System.out.println(height);
		
		m3.setAge(50);
		m3.setHeight(176.5);
		int age = m3.getAge();
		height = m3.getHeight();
		System.out.println(age);
		System.out.println(height);
		
	}
}

// ��Ʈ���� (������Ʈ��¥���� ������Ű properties -> location�� ȭ��ǥ(����)�̹��� ������ ��������)
