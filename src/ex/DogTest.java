package ex;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog1 = new Dog[5];
		
		dog1[0] = new Dog("�ٵ���","�ͽ�");
		dog1[1] = new Dog("�ǻ�","�ͽ�");
		dog1[2] = new Dog("����","����Ǫ��");
		dog1[3] = new Dog("Ȳ����","��Ƽ��");
		dog1[4] = new Dog("������","���޶�Ͼ�");
		
		for(int i=0; i < dog1.length; i++) {
			System.out.println(dog1[i].showDogInfo());
		}
	}
}