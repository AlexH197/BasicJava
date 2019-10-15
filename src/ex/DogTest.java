package ex;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog1 = new Dog[5];
		
		dog1[0] = new Dog("바둑이","믹스");
		dog1[1] = new Dog("뽀삐","믹스");
		dog1[2] = new Dog("초코","토이푸들");
		dog1[3] = new Dog("황금이","말티즈");
		dog1[4] = new Dog("구름이","포메라니안");
		
		for(int i=0; i < dog1.length; i++) {
			System.out.println(dog1[i].showDogInfo());
		}
	}
}