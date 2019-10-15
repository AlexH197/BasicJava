package alone;

public class Alphabets {

	public static void main(String[] args) {
		char[][] alphas = new char[13][2];
		char ch = 'a';
		
		for(int i = 0; i < alphas.length; i++) {
			for(int j = 0; j < alphas[i].length; j++) {
				alphas[i][j] = ch;
				System.out.print(alphas[i][j]);
				ch++;
			}
			System.out.println();
		}
	}
}
