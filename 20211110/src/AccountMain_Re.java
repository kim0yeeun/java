import java.util.Scanner;

public class AccountMain_Re {

	public static void main(String[] args) {
		Account_Re accs[] = new Account_Re[100];
		Scanner sc = new Scanner(System.in);
		int arrNum = 0;
		boolean run = true;
		
		do {
			System.out.println("1.���µ�� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.print("���� > ");
			String number =sc.nextLine();
			switch(number) {
			case "1" : 
				System.out.println("���� ��� �������Դϴ�. ���¹�ȣ�� �Է��ϼ���.");
				System.out.print("���¹�ȣ : ");
				String accountNum = sc.nextLine();
				System.out.print("������ :");
				String owner = sc.nextLine();
				System.out.print("�ݾ� : ");
				int balance = Integer.parseInt(sc.nextLine());
				accs[arrNum] = new Account_Re(accountNum,owner,balance);
				arrNum++;
				System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");
				break;
			case "2" : 
				System.out.println("���� ��� �������Դϴ�.");
				System.out.println("���¹�ȣ\t\t������\t\t�ݾ�");
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break; // ��������� �����ؾ��Ѵ�.
					System.out.println(accs[i].accountNum+"\t\t"+accs[i].owner+"\t\t"+accs[i].balance);
				}
				break;
			case "3" : 
				System.out.println("���� �������Դϴ�. ");
				System.out.print("���¹�ȣ : ");
				accountNum = sc.nextLine();
				System.out.print("�ݾ� : ");
//				balance = sc.nextInt();
				balance = Integer.parseInt(sc.nextLine());
				Account_Re acc = null;
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break; 
					if(accountNum.equals(accs[i].getAccountNum())) {
						//accs[i].balance+=balance;
						//accs[i].getBalance()+=balance;
						acc=accs[i];
					}
				}
				int result = acc.getBalance()+balance;
				acc.setBalance(result);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			case "4" : 
				System.out.println("��� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNum = sc.nextLine();
				System.out.print("�ݾ� : ");
//				balance = sc.nextInt();
				balance = Integer.parseInt(sc.nextLine());
				acc = null;
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break; 
					if(accountNum.equals(accs[i].getAccountNum())) {
						//accs[i].balance+=balance;
						//accs[i].getBalance()+=balance;
						acc=accs[i];
					}
				}
				result = acc.getBalance()-balance;
				acc.setBalance(result);                                // acc=accs[i]�� �����ϱ� ������ �ٲ��.????????????????????????
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				break;
			case "5" : 
				System.out.println("���α׷��� �����մϴ�.");
				run = false; break;
				
			}			
		}while(run);
	
		
	}

}

