
public class Ex_02 {

	public static void main(String[] args) {
		int[] i = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		Account[] accs = new Account[3];
		accs[0] = new Account("1111","�̼���",100);
		accs[1] = new Account("2222","�̽¹�",100);
		accs[2] = new Account();
		//accs[0] �� ��Ʈ����, ��Ʈ�� �ƴ� Account ��� Ŭ�����̹Ƿ� �ٽ� new �ؼ� ����������Ѵ�. 
	}

}
