
public class LoginMember {
	
	String userId;
	String userPw;
	public LoginMember(String userId, String userPw) {
		this.userId=userId;
		this.userPw=userPw;
	}
	
	public int login(String userId, String userPw) {
		if(this.userId.equals(userId)) {
			if(this.userPw.equals(userPw)) {
				return 1;
			}else return 0; // ��й�ȣ�� Ʋ�Ƚ��ϴ�. 
		}else return -1; // ���̵� �������� ���� 
	}
	public void logout(String userId) {
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
	
	
}
