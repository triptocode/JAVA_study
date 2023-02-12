package templateCars;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public void startCar() {
		System.out.println("시동을 킴");
	}
	public void turnOff() {
		System.out.println("시동을 끊다");
	}
	public void washCar() {} // abstract로하면 {}는 모든 자식클래스들이 구현해야함
	// 하위클래스에서 순서를 재 정의 할수없게 final
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	

}
 