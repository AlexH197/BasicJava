package basic;

import java.util.Scanner;

public class PageExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		int cdata = (int)(Math.random()*100);
		int udata, mindata = 0, maxdata = 99;
		System.out.println("수를 결정하였습니다. 맟추어 보세요.");
		System.out.println("0-99");
		
		while(true) { //무한루프 발생
			count++; //1로 바뀜 1씩커지기때문
			System.out.print(count+" >>");
			udata = s.nextInt();
			
			if(cdata == udata) {
				System.out.println("맞았습니다.");
				System.out.print("다시 하시겠습니까 (Y/N) >>");
				if(s.next().toUpperCase().charAt(0)=='Y') { //toUpperCase()를 추가함으로써 소문자, 대문자 y 모두 사용가능
					count=0;
					System.out.println("수를 결정하였습니다. 맟추어 보세요. >>");
					System.out.println("0-99");
					cdata = (int)(Math.random()*100);
					mindata = 0; maxdata = 99;
				}
				else
					break;
			}
			else if(cdata > udata) {
				mindata = udata;
				System.out.println("더 높게");
				System.out.println(udata+"-"+maxdata);
			}
			else {
				maxdata = udata;
				System.out.println("더 낮게");
				System.out.println(mindata+"-"+maxdata);
			}
		}
		s.close();
	}
}
