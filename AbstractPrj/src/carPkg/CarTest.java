package carPkg;

public class CarTest {
    public static void main(String[] args) {

        System.out.println("==== template 메서드방식: DriverlessCar info ====");
        Car aiCar =new DriverlessCar();
        aiCar.execute();

        System.out.println("==== template 메서드방식: DriverCar info ====");
        Car manualCar = new DriverCar();
        manualCar.execute();
    }

}
