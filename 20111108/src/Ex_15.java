
public class Ex_15 {

	public static void main(String[] args) {
		Week_1 today = Week_1.�����; 
		System.out.println(today);		// ���������
		String name = today.name();		// ������ ����� ���ڿ��� ��ȯ 
		System.out.println(name);		// ���ڿ�
		
		// ������ ����� ���� �ִ� �������� ������ ���� 
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week_1 day1 = Week_1.�����;
		Week_1 day2 = Week_1.ȭ����;
		
		int result = day1.compareTo(day2); // ȭ���� -> ����� +2
		System.out.println(result); // 2�� �������ϴ�. 
		result = day2.compareTo(day1); // ����� -> ȭ���� -2 
		System.out.println(result); // 2�� ���Դϴ�. 

		// ���ڿ��� ���������� ��ȯ
		String day = "������";
		Week_1 weekDay = Week_1.valueOf(day);
		System.out.println(weekDay); //���������
		
		System.out.println("=====");
		
		// �������� �ִ� ��� ����� ��������
		Week_1 day3 = Week_1.�ݿ���;
		// �������������� ������ ��� �ϳ��� ����ȴ�.
		// �� ���ʹٸ�? �迭�� ����
		Week_1 [] days = Week_1.values(); // ��� ���� ������ڴ�.
		// ������ ����� �迭�� ��ȯ���ش�. 
		for(Week_1 w : days) {
			System.out.println(w);
		}
	
	}

}
