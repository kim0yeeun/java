
public class Test {

	public static void main(String[] args) {
		Board board = new Board(1,"����","������ƺ�","����","192.168.0.100",2);
		System.out.println("���� : "+ board.getSubject());
		System.out.println("�۾��� : "+board.getWriter());
		System.out.println("���� : "+board.getContent());
		System.out.println("IP : "+board.getIp());
		System.out.println("�湮�ڼ� : "+board.getReadcount());
		
		Car car = new Car("����","�ҳ�Ÿ","����",240);
		Car car1 = new Car();
		car1.setColor("���");
		car1.setCompany("���");
		car1.setModel("k7");
		car1.setMaxSpeed(250);
		System.out.println(car1.getColor());
		System.out.println(car1.getCompany());
		System.out.println(car1.getModel());
		System.out.println(car1.getMaxSpeed());
			
	}
}
