package exception;

public class ArrayException0 {

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		
//		for(int i = 0; i < 5; i++) {
//			arr[i] = i;
//			System.out.println(arr[i]);
//		}
		int[] arr = new int[5];		//0부터 5까지 총 6개 숫자를 배열에 넣기 때문에 에러가 발생
		
		for(int i = 0; i <= 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}

}
