package sorting;

public interface Sort {
	public void ascending(int [] arr);
	public void desending(int [] arr);

	default void description () {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}
