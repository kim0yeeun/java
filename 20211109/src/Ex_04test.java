
public class Ex_04test {

	public static void main(String[] args) {
		Ex_04 ex04 = new Ex_04();
		ex04.setData(18,175.5,false,"�̻��");
		String name = ex04.getName();
		int age = ex04.getAge();
		System.out.println(name);
		
		Ex_04 ex04_1 = new Ex_04();
		
		ex04_1.setAge(35);
		ex04_1.setGender(false);
		ex04_1.setHeight(173.5);
		ex04_1.setName("�̼���");
		
		name = ex04_1.getName();
		System.out.println(name);
		
		
		/// ��ü ���⿡���� �̷��� ����ϸ� �ȵȴ�. 
		Ex_04 ex04_2 = new Ex_04();
		ex04_2.age = 20;
		ex04_2.gender = true;
		ex04_2.height = 160.5;
		ex04_2.name = "������";
		System.out.println(ex04_2.name);
		
		
		
	
	}

}
