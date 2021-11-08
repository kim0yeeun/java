
public class Ex_05 {

	public static void main(String[] args) {
		// args에 매개변수를 cmd창에서 입력받아 코드 실행 
		System.out.println(args[0]);
		System.out.println(args[1]);
		// args를 이용해서 원하는 단의 범위를 출력하세요.
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
