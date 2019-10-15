package ex;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("바둑이","믹스"));
		list.add(new Dog("뽀삐","믹스"));
		list.add(new Dog("초코","토이푸들"));
		list.add(new Dog("황금이","말티즈"));
		list.add(new Dog("구름이","포메라니안"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
		System.out.println("==============");
		for(Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}

}
