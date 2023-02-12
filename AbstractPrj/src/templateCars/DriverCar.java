package templateCars;

public class DriverCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("human drives");
	}
	@Override
	public void stop() {
		System.out.println("human pushes the brake");
	}

}
