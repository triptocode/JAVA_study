package templateCars;

public class DriverlessCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("self-driving");	
	}
	@Override
	public void stop() {
		System.out.println("self-stop");
	}
}
