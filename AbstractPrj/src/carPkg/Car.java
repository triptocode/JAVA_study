package carPkg;

public abstract class Car {
    public abstract void drive2();
    public abstract void stop3();
    public void startCar1() {System.out.println("시동을 킴");}
    public void turnOffCar5() {System.out.println("시동을 끊다");}
    // abstract가아닌 일반method로 {]를 빈상태로두어
    // 자식클래스중 {}를 구현할 필요가 있는 자식클래스만 override해서 구현하게 설계하는 방식
    public void wash4() {} // 부모클래스에서 abstract 메서드로하면 {}는 모든 자식클래스들이 구현해야함
    final public void execute() { // 하위클래스에서 순서를 재 정의 할수없게 final
        startCar1();
        drive2();
        stop3();
        wash4();
        turnOffCar5();

    }
}
