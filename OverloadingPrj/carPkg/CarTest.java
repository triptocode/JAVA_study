package carPkg;

public class CarTest {
    public static void main(String[] args) {

        Car myOldCar1 = new Car("Matiz", "compact");
        Car myOldCar2 = new Car("Starex", "sedan");

        Car myCar1 = new Car("Volkswagen Golf","Hatchback", 2021);
        Car myCar2 = new Car("(Mercedes C300", "Sedan", 2000 );
        Car myCar3 = new Car("Mercedes CLS","Coupe", 2020);
        Car myCar4 = new Car("Genesis GV70", "SUV", 2023);

//        System.out.println(m); // Main.java 에서 toString()에 파라미터넣기전에는 주소값만나옴

        System.out.println("==================== 1999년도 생산된 올드 카 ====================");
        System.out.println(myOldCar1);
        System.out.println(myOldCar2);
        System.out.println("==================== 2000년대 생산된 신형 카 ====================");
        System.out.println(myCar1); // m1.toString() 효과
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(myCar4);

//        System.out.println(m1.modelYear);
    }

}
