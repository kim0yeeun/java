import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // import �ϰ������ (��Ʈ�� + ����Ʈ + ���� + o) �ϸ� �ڵ� import��  
		
//		Account acc1 = new Account("1111","�̼���",100);
//		Account acc2 = new Account("2222","�̻��",100);
//		Account acc3 = new Account("3333","�����",100);
		Account [] accs = new Account[100]; //100���� ���¸� ����
		// �迭�� index�� 0������ ���� 
		boolean run = true;
		
		do{
			System.out.println("1.���µ�� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.print("���� > ");  // ln�� ����� ���� ���� Ŀ���� ���� �ȴ�. 
			String selecNo = sc.nextLine(); // nextline : ���ڿ�
			//int selecNo = sc.nextInt : ���� 
			switch(selecNo) {
			case "1":
				System.out.println("���µ�� �������Դϴ�.");
				System.out.print("���� ��ȣ : ");
				String accountNo = sc.nextLine();
				System.out.println("������ : ");
				String owner = sc.nextLine();
				System.out.println("�ݾ� : ");
				int money = sc.nextInt();
				accs[0] = new Account(String accountNo, String owner, int balance);
				break;
			case "2":
				System.out.println("���¸�� �������Դϴ�.");
				break;
			case "3":
				System.out.println("���� �������Դϴ�.");
				break;
			case "4":
				System.out.println("��� �������Դϴ�.");
				break;
			case "5":
				System.out.println("���α׷��� �����մϴ�.");
				run = false; break;
				// System.exit(0); (run �ƴϰ� while�� ���� true�� �ִ� ���)
		
			}
		
		}while(run);
	}

}
