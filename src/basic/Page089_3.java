package basic;

import java.util.Scanner;

public class Page089_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �����ڸ� �Է��ϼ���. >>");
		
		boolean a = scan.nextBoolean(); //true�ڸ�
		String op = scan.next().toUpperCase(); //�빮�ڷθ� �Է��ϰڴ�.
		boolean b = scan.nextBoolean(); //false �ڸ�
		
		switch(op) {
		case "AND" :
			System.out.println(a && b);
			break;
		case "OR" :
			System.out.println(a || b);
			break;
		default:
			System.out.println("�Է� �����Դϴ�. �ٽ� �Է��ϼ���.");
		}
		scan.close();
	}
}
