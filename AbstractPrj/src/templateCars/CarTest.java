package templateCars;

public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("==== DriverlessCar info ====");
		
		Car aiCar =new DriverlessCar();
		aiCar.run();
		
		System.out.println("==== DriverCar info ====");
		
		Car manualCar = new DriverCar();
		manualCar.run();
	}

}
