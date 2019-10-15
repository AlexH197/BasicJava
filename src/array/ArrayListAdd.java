package array;
import java.util.*;

public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
//		ArrayList<Integer> arrayList2 = new ArrayList<>();
	
		arrayList.add(1);	//index값 0
		arrayList.add(2);	//index값 1
		arrayList.add(3);	//index값 2
		arrayList.add(4);	//index값 3
		arrayList.add(5);	//index값 4
		
		List<Integer> list = arrayList.subList(2, 4);//시작하는인덱스값은 포함, 끝나는 인데스값은 미포함 바로 이전값까지 출력됨
		
/*		arrayList2.add(10);
		arrayList2.add(30);
		arrayList2.add(20);
		
		arrayList.remove(1);	//index 1에 해당하는 요소 제거
//addAll()메소드를 통해 arrayList2에 있는 데이터 추가하기
//		arrayList.addAll(arrayList2);
		
//		arrayList.add(1,10);	//요소들이 자동으로 뒤로 밀리게 된다.
		*/
		for(int i:arrayList) {
			System.out.println("value: " + i);
		}
		System.out.println();
		for(int i:list) {
			System.out.println("subList메소드로 가져온 List:"+i);
		}
	}
}
