package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest03 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '끝') {
				System.out.print((char)i);
			}
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}

}//한글을 이용해서 출력하는 법