package inheritance;

public class BusTest {

	public static void main(String[] args) {
		Car car = new Bus();
		car.run();
		
		Bus bus = (Bus)car;//bus 타입으로 강제 변환
		bus.ppangppang();
		
	}

}
