
public class Ex_05 {
	static int first;
	static int second;
	int val; // ��������̸鼭 instance �����̴�. �� ��ü���� ���Ӱ� �����ϴ� �����̴�. 
	static {
		first = 20;
		second = 10;
		//val = 10; instance ������ static ������ �ʱ�ȭ �� �� ����. 
	}
	public static int add() {
		return first + second;
	}
}
