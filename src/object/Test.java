package object;

public class Test {
	// 선생님이 만든 코드

	public static void main(String[] args) {
// == 참조 비교(주소 비교), 모든 기본유형(byte, int float, double...)
		System.out.println("1:"+(10 == 20));//fales
		System.out.println("2:"+(10 == 20));//true
		System.out.println("3:"+('a' == 'b'));//false
		System.out.println("4:"+('a' == 97.0));//true
		System.out.println("5:"+(true == true));//true
		
//equals() 두 객체의 갑이 같은지 비교,
//		기본유형에 대해서는 적용할 수 없다.
//		 문자열의 데이터 내용 비교한다.
		String s1 = new String("A");
		String s2 = new String("A");
		String s3 = s2;
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s1));//true
		String s4  = new String("B");
		System.out.println(s3.equals(s4));//false
	}

}
