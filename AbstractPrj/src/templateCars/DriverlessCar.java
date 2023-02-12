package templateCars;

public class DriverlessCar extends Car {
	// 자식클래스가 부모abstract클래스 추상메서드 {}를 구현하는 이유: 
	// 자식클래스가 부모 추상클래스의 추상메서드를 구체화해야 new로 객체생성가능해서
	@Override
	public void drive() {
		System.out.println("self-driving");	
	}
	@Override
	public void stop() {
		System.out.println("self-stop");
	}
	@Override
	public void washCar() {
		System.out.println("self-washing");
	};
}
