package carPkg;
public class Car {
    String modelName;
    String modelSize;
    int modelYear;

    // 생성자 메서드 1 :
    // 생성자는 클래스명 동일, 리턴값x, 상속x
    // 생성자는 객체 생성할때 new와 함께 호출되는 메서드
    // 생성자는 인스턴스 초기화를 위해 사용되는 메서드
    Car(String name, String size) {
        modelName = name;
        modelSize = size;
        modelYear = 1999;
    }
    
    // 생성자 메서드 2
    // overloade : 메서드명은 동일, 파라미터는 다르게!
    // 오버로딩으로 동일한 Car메서드명 1번과 2번이 다른 파라미터로 구성함

     Car(String name, String size, int year) {
        modelName = name;
        modelSize = size;
        modelYear = year;
    }


    // override :  동일한 메서드명에 파라미터가 다른것이 오버로딩이면
    // 오버라이드는 다른 메서드명으로 재정의 한것
    @Override
    public String toString() {
        return  "[모델명: " + modelName+"] ,"+"[모델사이즈: "+modelSize+"], "+"[모델연도: " + modelYear+"]";
    }

}