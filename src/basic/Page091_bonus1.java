package basic;

import java.util.Scanner;

public class Page091_bonus1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.print("���� �Է��ϼ��� >>");
		double op1 = scan.nextDouble();
		String operator = scan.next();
		double op2 = scan.nextDouble();
		
		double result = 0; //�ʱ�ȭ
		
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
				System.out.println("0���� ���� �� �����ϴ�.");
				scan.close();
				return;
			}
			result = op1 / op2;
			break;
		default : 
			System.out.println("�����ȣ�� �߸��ԷµǾ����ϴ�.");
		}
		System.out.println("���� ��� : "+result);
		scan.close();
	}

}
