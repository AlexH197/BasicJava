package object;

public class Test {
	// �������� ���� �ڵ�

	public static void main(String[] args) {
// == ���� ��(�ּ� ��), ��� �⺻����(byte, int float, double...)
		System.out.println("1:"+(10 == 20));//fales
		System.out.println("2:"+(10 == 20));//true
		System.out.println("3:"+('a' == 'b'));//false
		System.out.println("4:"+('a' == 97.0));//true
		System.out.println("5:"+(true == true));//true
		
//equals() �� ��ü�� ���� ������ ��,
//		�⺻������ ���ؼ��� ������ �� ����.
//		 ���ڿ��� ������ ���� ���Ѵ�.
		String s1 = new String("A");
		String s2 = new String("A");
		String s3 = s2;
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s1));//true
		String s4  = new String("B");
		System.out.println(s3.equals(s4));//false
	}

}
