import java.util.Scanner;

public class Ex_03test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Ex_03.name);
		Ex_03.name="�����";
		System.out.println(Ex_03.name);
		
		// final������ ��ü���� ���� �ʱ�ȭ �� �� �ִ�. ��, �� �� �ʱ�ȭ�� �ϸ� ������ �� ����. 
		Ex_03 ex01 = new Ex_03(20,30);
		Ex_03 ex02 = new Ex_03(50,20);
		System.out.println(ex01.getVal1());
		System.out.println(ex02.getVal1());
		
		System.out.println("=====");
		
		// ����� ����ϴ� ������ ��� ��ü���� ������� ���� ������ ���� ����ϱ� ���ؼ��̴�. 
		System.out.println(ex01.first);
		System.out.println(ex01.second);
		System.out.println(ex02.first);
		System.out.println(ex02.second);
		// ex01.first = 10; �� ���� �Ұ� 
		System.out.println(ex01.getFirst());
		System.out.println(ex01.getSecond());
	}

}
