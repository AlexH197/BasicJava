package basic;

import java.util.Scanner;

public class Page086 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("����, ����, �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("ö�� >>");
		String c = scan.next();
		System.out.print("���� >>");
		String y = scan.next();
		
		if(c.equals(y)) //������ ��
			System.out.println("�����ϴ�.");
		else if(c.equals("����")) {
			if(y.equals("����")) 
				System.out.println("���� �̰���ϴ�.");
			else 
				System.out.println("ö���� �̰���ϴ�.");
			}
		else if (c.equals("����")) {
			if(y.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("���� �̰���ϴ�.");
			}
		else  {
			if(y.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		scan.close();
	}
}
