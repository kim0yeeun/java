
public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		if(args[0].equals("/?")) {
			System.out.println("���� ���");
		}else if(args[0].equals("+")) {
			result = Integer.parseInt(args[1]) 
					+ Integer.parseInt(args[2]);
			System.out.println(result);
		}else if(args[0].equals("-")) {
			result = Integer.parseInt(args[1]) 
					- Integer.parseInt(args[2]);
			System.out.println(result);
		}
		// String [] args = {"+","10","20}
		String [] str = {"�̼���", "�̻��", "�����"};
		System.out.println(str[0]);
	}

}