package inheritance;

public class Ex_05test {

	public static void main(String[] args) {
		Ex_05 ex05 = new Ex_05();
		//Ex_05�� ��������� Ex_04�� ������ ����� �� �ִ�. 
		ex05.setFirst(20);		//Ex_04
		ex05.setSecond(30);		//Ex_04
		ex05.add();				//Ex_04
		System.out.println(ex05.getResult());
		ex05.sub();				//Ex_05
		System.out.println(ex05.getResult());
		
	}

}
