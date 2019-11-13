package basic;

import java.util.Scanner;

public class Page091_bonus1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.print("식을 입력하세요 >>");
		double op1 = scan.nextDouble();
		String operator = scan.next();
		double op2 = scan.nextDouble();
		
		double result = 0; //초기화
		
		switch(operator) {
		case "+" :
			result = op1 + op2;
			break;
		case "-" :
			result = op1 - op2;
			break;
		case "*" :
			result = op1 * op2;
			break;
		case "/" :
			if(op2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scan.close();
				return;
			}
			result = op1 / op2;
			break;
		default : 
			System.out.println("연산기호가 잘못입력되었습니다.");
		}
		System.out.println("연산 결과 : "+result);
		scan.close();
	}

}
