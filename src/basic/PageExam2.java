package basic;

import java.util.Scanner;

class Player{
//	Scanner s = new Scanner(System.in);
	String name;
	String word;
	
	public Player(String name) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public boolean succeed(String word) {
		int lastIndex = word.length()-1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = this.word.charAt(0);
		if(lastChar != firstChar)
			return false;
		else
			return true;
	}
}
public class PageExam2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원이 몇명인가요? >>");
		int count = s.nextInt();
		Player[] p = new Player[count];
		
		for(int i =0; i<count; i++) {
			System.out.print("참가자 이름을 입력하세요 >>");	
			p[i] = new Player(s.next());
		}
		String word = "아버지";
		System.out.println("시작하는 단어는 "+word+"입니다.");
		
	}

}
