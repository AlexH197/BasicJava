package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest03 {

	public static void main(String[] args) {
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������.");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '��') {
				System.out.print((char)i);
			}
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}

}//�ѱ��� �̿��ؼ� ����ϴ� ��