package templateCars;

public class ManualCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("human drives");
	}
	@Override
	public void stop() {
		System.out.println("human pushes the brake");
	}

}
