
public class ArrayTest {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		
		int i[] = new int[3];
		i[0] = i1;		// 10
		i[1] = i2;		// 20
		i[2] = i2;		// 30
		
		Board b1 = new Board(1,"�̼���","����1","����1",0); // () �� �ִٴ°� ��ü�� �����Ǿ��ٴ°� -> ������
		Board b2 = new Board(2,"�̻��","����2","����2",0); // �湮�ڼ��� �ʱⰪ 0 
		
		Board b[] = new Board[100]; // [] �� �����Ƿ� Board�� �迭 ��ü�� ������� �� 
		//b[0] = b1;
		b[0] = new Board(1,"�̼���","����1","����1",0);
		b[1] = new Board(2,"�̻��","����2","����2",0);
		b[2] = new Board(3,"�����","����3","����3",0);
		
		System.out.println(i1);
		System.out.println(i1);
		System.out.println(i1);
		
		for (int n : i) {
			System.out.println(n);
		}
		
		System.out.println(b1.getNum());
		System.out.println(b1.getWriter());
		System.out.println(b1.getSubject());
		System.out.println(b1.getContent());
		System.out.println(b1.getReadCount());
		
		for (Board n : b) {
			if (n==null) break;
			System.out.println(n);   // ���� 5���� �ִ� �ּҰ� ��µȴ�.
			System.out.print(n.getNum()+" ");
			System.out.print(n.getWriter()+" ");
			System.out.print(n.getSubject()+" ");
			System.out.print(n.getContent()+" ");
			System.out.println(n.getReadCount()+" ");
		}
	}

}
