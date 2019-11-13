package basic;

import java.util.Scanner;

public class Page089_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("논리 연산자를 입력하세요. >>");
		
		boolean a = scan.nextBoolean(); //true자리
		String op = scan.next().toUpperCase(); //대문자로만 입력하겠다.
		boolean b = scan.nextBoolean(); //false 자리
		
		switch(op) {
		case "AND" :
			System.out.println(a && b);
			break;
		case "OR" :
			System.out.println(a || b);
			break;
		default:
			System.out.println("입력 오류입니다. 다시 입력하세요.");
		}
		scan.close();
	}
}
