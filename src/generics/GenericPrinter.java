package generics;

public class GenericPrinter <T extends Material> {
	private T material; //재료의 타입을 제너릭으로두고 T가 플라스틱이나 파우더, 초콜릿이 올수있다.

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
