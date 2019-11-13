package basic;

import java.util.Scanner;

public class Page086 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("가위, 바위, 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >>");
		String c = scan.next();
		System.out.print("영희 >>");
		String y = scan.next();
		
		if(c.equals(y)) //같은것 비교
			System.out.println("비겼습니다.");
		else if(c.equals("가위")) {
			if(y.equals("바위")) 
				System.out.println("영희가 이겼습니다.");
			else 
				System.out.println("철수가 이겼습니다.");
			}
		else if (c.equals("바위")) {
			if(y.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("영희가 이겼습니다.");
			}
		else  {
			if(y.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		scan.close();
	}
}
