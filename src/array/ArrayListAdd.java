package array;
import java.util.*;

public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
//		ArrayList<Integer> arrayList2 = new ArrayList<>();
	
		arrayList.add(1);	//index�� 0
		arrayList.add(2);	//index�� 1
		arrayList.add(3);	//index�� 2
		arrayList.add(4);	//index�� 3
		arrayList.add(5);	//index�� 4
		
		List<Integer> list = arrayList.subList(2, 4);//�����ϴ��ε������� ����, ������ �ε������� ������ �ٷ� ���������� ��µ�
		
/*		arrayList2.add(10);
		arrayList2.add(30);
		arrayList2.add(20);
		
		arrayList.remove(1);	//index 1�� �ش��ϴ� ��� ����
//addAll()�޼ҵ带 ���� arrayList2�� �ִ� ������ �߰��ϱ�
//		arrayList.addAll(arrayList2);
		
//		arrayList.add(1,10);	//��ҵ��� �ڵ����� �ڷ� �и��� �ȴ�.
		*/
		for(int i:arrayList) {
			System.out.println("value: " + i);
		}
		System.out.println();
		for(int i:list) {
			System.out.println("subList�޼ҵ�� ������ List:"+i);
		}
	}
}
