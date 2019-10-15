package ex;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("�ٵ���","�ͽ�"));
		list.add(new Dog("�ǻ�","�ͽ�"));
		list.add(new Dog("����","����Ǫ��"));
		list.add(new Dog("Ȳ����","��Ƽ��"));
		list.add(new Dog("������","���޶�Ͼ�"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
		System.out.println("==============");
		for(Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}

}
