
package ex;
import java.util.Scanner;
public class AMSD_20191010_2 {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ���.");
		String input = scan.nextLine();
		
		System.out.println("�����ڸ� �Է��ϼ���.");
		String input4 = scan.nextLine();
		
		System.out.println("�ι�° ���� �Է��ϼ���.");
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
