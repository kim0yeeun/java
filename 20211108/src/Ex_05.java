
public class Ex_05 {

	public static void main(String[] args) {
		// args�� �Ű������� cmdâ���� �Է¹޾� �ڵ� ���� 
		System.out.println(args[0]);
		System.out.println(args[1]);
		// args�� �̿��ؼ� ���ϴ� ���� ������ ����ϼ���.
		int start =Integer.parseInt(args[0]);
		int end =Integer.parseInt(args[1]);
		// start = int(args[0]) : python
		for (int i =start; i<=end;i++) {
			for (int j =1; j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}
