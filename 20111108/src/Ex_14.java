import java.util.Calendar;

public class Ex_14 {

	public static void main(String[] args) {
		Week today; // ������ ��� ���� ����
		today = Week.Monday; // ������ ������ ������� ����
		System.out.println(today);
		// ��� ��
		// calendar�� ��¥�� ����ϱ� ���� �ڷ����̴�.
		Calendar cal = Calendar.getInstance();
		// ��¥�� ����ϱ� ���� cal ���� ����
		// cal�̶�� ������ �̿��ؼ� ������ ��������.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		// 2 : ������ 
		switch(week) {
		case 1 : today = Week.Sunday; break;
		case 2 : today = Week.Monday; break;
		case 3 : today = Week.Tuesday; break;
		case 4 : today = Week.Wednesday; break;
		case 5 : today = Week.Thursday; break;
		case 6 : today = Week.Friday; break;
		case 7 : today = Week.Saturday; break;
		}
		System.out.println("Today : "+today);
		if (today==Week.Sunday) {
			System.out.println("�����!");
		}else {
			System.out.println("���սô�..");
		}
	}

}

