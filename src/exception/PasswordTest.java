package exception;

public class PasswordTest {
	private String userPassword;
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) throws PasswordException{
		if(userPassword == null) {
			throw new PasswordException("�н������ null�� �� �����ϴ�.");
		}
		else if(userPassword.length() < 5) {
			throw new PasswordException("�н������ 5�� �̻� ������.");
		}
		else if(userPassword.matches("[a-zA-Z]+")) {
			throw new PasswordException("�н������ ���ڸ� �����ؾ��մϴ�.");
		}
		this.userPassword = userPassword;
	}

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String userPassword = null;
		try {
			test.setUserPassword(userPassword);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPassword = "1234";
		try {
			test.setUserPassword(userPassword);
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPassword = "abcde";
		try {
			test.setUserPassword(userPassword);
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPassword = "abcde1";
		try {
			test.setUserPassword(userPassword);
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
