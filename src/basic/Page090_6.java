package basic;

import java.util.Scanner;

public class Page090_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��ϼ���. >>");
		int data = scan.nextInt();
		int first = data /10;
		int second = data %10;
		
		if (first == 3 || first == 6 || first == 9)
			if(second ==  3 || second == 6 || second == 9)
			 System.out.println("�ڼ�¦¦");
			else
				System.out.println("�ڼ�¦");
		else
			if(second==3||second==6||second==9)
				System.out.println("¦¦");
			else
				System.out.println("�ڼ�����");
				
//		System.out.println(first+","+second);
		scan.close();
	}

}
