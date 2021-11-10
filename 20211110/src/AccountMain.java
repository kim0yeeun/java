import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // import 하고싶으면 (컨트롤 + 쉬프트 + 영문 + o) 하면 자동 import됨  
		
//		Account acc1 = new Account("1111","이숭무",100);
//		Account acc2 = new Account("2222","이상범",100);
//		Account acc3 = new Account("3333","이장범",100);
		Account [] accs = new Account[100]; //100개의 계좌를 만듬
		// 배열의 index는 0번부터 시작 
		boolean run = true;
		
		do{
			System.out.println("1.계좌등록 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.print("선택 > ");  // ln을 지우면 선택 옆에 커서가 오게 된다. 
			String selecNo = sc.nextLine(); // nextline : 문자열
			//int selecNo = sc.nextInt : 정수 
			switch(selecNo) {
			case "1":
				System.out.println("계좌등록 페이지입니다.");
				System.out.print("계좌 번호 : ");
				String accountNo = sc.nextLine();
				System.out.println("예금주 : ");
				String owner = sc.nextLine();
				System.out.println("금액 : ");
				int money = sc.nextInt();
				accs[0] = new Account(String accountNo, String owner, int balance);
				break;
			case "2":
				System.out.println("계좌목록 페이지입니다.");
				break;
			case "3":
				System.out.println("예굼 페이지입니다.");
				break;
			case "4":
				System.out.println("출금 페이지입니다.");
				break;
			case "5":
				System.out.println("프로그램을 종료합니다.");
				run = false; break;
				// System.exit(0); (run 아니고 while에 직접 true를 넣는 경우)
		
			}
		
		}while(run);
	}

}
