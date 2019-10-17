package sorting;

public class BubbleSort implements Sort {
	
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void desending(int[] arr) {
		System.out.println("BubbleSort descending");
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort¿‘¥œ¥Ÿ.");		
	}
}
