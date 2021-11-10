import java.util.Scanner;

public class AccountMain1 {


	// AccountMain�� �ݺ��Ǵ� ������ �Լ�ȭ �� ��
	// �׷��� ������ ����ϱ� ���ؼ� static �� ����ؼ� main �Լ� ������ �����ش�. 
	
	static Scanner sc = new Scanner(System.in); // import �ϰ������ (��Ʈ�� + ����Ʈ + ���� + o) �ϸ� �ڵ� import�� 
//	Account acc1 = new Account("1111","�̼���",100);
//	Account acc2 = new Account("2222","�̻��",100);
//	Account acc3 = new Account("3333","�����",100);
	static Account [] accs = new Account[100]; //100���� ���¸� ����
	// �迭�� index�� 0������ ���� 
	static int arrayNum=0; // �迭�� ���� ��ȣ�� ������ ���� ���� 
	static boolean run = true;
	
	public static void main(String[] args) {
		do{
			System.out.println("1.���µ�� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.print("���� > ");  // ln�� ����� ���� ���� Ŀ���� ���� �ȴ�. 
			String selecNo = sc.nextLine(); // nextline : ���ڿ�
			//int selecNo = sc.nextInt : ���� 
			//sc.nextline(); �� �ϳ� �� ��������Ѵ�.
			//why? �ȱ׷��� ���� �ް� "����" �� �������ͼ� �ؿ� ���� ����ϴ� ������ �ϳ� ����� 
			//�� �Է���ġ�� \n�� �����ִ� ���� �����ִ� ���� 
			switch(selecNo) {
			case "1":
				System.out.println("���µ�� �������Դϴ�.");
				System.out.print("���� ��ȣ : ");
				String accountNo = sc.nextLine();
				System.out.print("������ : ");
				String owner = sc.nextLine();
				System.out.print("�ݾ� : ");
				int money = sc.nextInt();
				accs[arrayNum] = new Account(accountNo,owner,money);
				arrayNum++;
				System.out.println("���µ���� �Ϸ�Ǿ����ϴ�.\n");
				break;
			case "2":
				System.out.println("���¸�� �������Դϴ�.");
				System.out.println("���¹�ȣ \t\t ������ \t\t �ݾ�");
				accountPrint();
				
				break;
			case "3":
				System.out.println("���� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.print("���� �ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				
				Account acc=accountFind(accountNo);
				//acc=new Account();
				
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				break;
			case "4":
				System.out.println("��� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.print("��� �ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				//acc=null;
				//acc=new Account();
				
				acc=accountFind(accountNo);
				
				result = acc.getBalance() - money;
				acc.setBalance(result);
				break;
			
			case "5":
				System.out.println("���α׷��� �����մϴ�.");
				run = false; break;
				// System.exit(0); (run �ƴϰ� while�� ���� true�� �ִ� ���)
		
			}
		
		}while(run);
	}
	public static Account accountFind(String accountNo) { // return�� Account�� ���� 
		for(int i=0; i<accs.length; i++) {
			if(accs[i]==null) break;
			else {
				if(accs[i].getAccountNo().equals(accountNo)) {
					// ���¹�ȣ�� ��ġ�ϴ� Account�� ������ �ͼ� acc�� ���� 
					return accs[i];	
					// acc=accs[0], acc=accs[1] ,..., 
					}
			}
		}
		return null; // return ���� ������ ������ ���� ������ if������ else�� ��� ���� ���� ������Ѵ�. 
	}
	
	public static void accountPrint() {
		for(int i=0; i< accs.length;i++) {
			if(accs[i]==null) break;
			System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());
		}
		
		
	}

}
