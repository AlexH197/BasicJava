package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {
	static String path="D:\\JAVA_LAB\\a.txt";
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");	//�μ��ǹ߻��Ҽ�����
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();//�����Է½�Ʈ���ݱ�
				} catch (IOException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
