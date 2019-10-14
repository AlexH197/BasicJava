package ex;

public class Car {
	
	private static int serialNum = 2589;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
