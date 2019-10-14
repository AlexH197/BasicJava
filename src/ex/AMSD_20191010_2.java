
package ex;
import java.util.Scanner;
public class AMSD_20191010_2 {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요.");
		String input = scan.nextLine();
		
		System.out.println("연산자를 입력하세요.");
		String input4 = scan.nextLine();
		
		System.out.println("두번째 수를 입력하세요.");
		String input2 = scan.nextLine();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		if(input4.equals("*")) {
			int result = num * num2;
			System.out.println(result);
		}
		else if(input4.equals("/")) {
			int result = num / num2;
			System.out.println(result);
		}
		else if(input4.equals("-")) {
			int result = num - num2;
			System.out.println(result);
		}
		else if(input4.equals("+")) {
			int result = num + num2;
			System.out.println(result);
		}
	}

}
