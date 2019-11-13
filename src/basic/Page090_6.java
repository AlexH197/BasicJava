package basic;

import java.util.Scanner;

public class Page090_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하세요. >>");
		int data = scan.nextInt();
		int first = data /10;
		int second = data %10;
		
		if (first == 3 || first == 6 || first == 9)
			if(second ==  3 || second == 6 || second == 9)
			 System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		else
			if(second==3||second==6||second==9)
				System.out.println("짝짝");
			else
				System.out.println("박수없음");
				
//		System.out.println(first+","+second);
		scan.close();
	}

}
