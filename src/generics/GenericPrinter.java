package generics;

public class GenericPrinter <T extends Material> {
	private T material; //����� Ÿ���� ���ʸ����εΰ� T�� �ö�ƽ�̳� �Ŀ��, ���ݸ��� �ü��ִ�.

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}



}
