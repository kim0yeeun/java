
public class Singleton { 	// 1,2�� �����Ǹ� �� Ŭ������ �̱������� ����ϰڴٴ� �ǹ��̴�.
	int first;
	int second;
			static	  int 		val_1  =      20		;
	private static    int       val    =      10        ;
	
	// �ڱ� �ڽ��� ��ü�� �̸� ����� ���� ��� 
	private static Singleton singleton = new Singleton();    		//30000 ���� 
	// 1. �̱����� ����� ��쿡 Ŭ�������� �ڱ� �ڽ��� ���������Ѵ�. 
	// static => ������ �ȿ� Ŭ�������� �����ϹǷ� �ν��Ͻ����� �ִ� �� �ƴ϶� Ŭ���� �ȿ� �ѹ� ������ 
	private Singleton() {}
	
	public static Singleton getInstance() {		// �ڽ��� ��ü�� ���� GETINSTANCE!!! ��� 
		return singleton;
		// 2. static�� �ָ� ��ȯ�ϱ� ���� ��� 
	}
	
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public static Singleton getSingleton() {
		return singleton;
	}
	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
	
	
}
