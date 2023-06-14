package lang01Obj;


class MyClass1{}
class MyClass2 { public String toString(){return "Object클래스의 toString메소드를 상속받고, override 재정의";}}
//class MyClass2 extends Object{ public String toString(){return "Object클래스의 toString메소드를 상속받고, override 재정의";}}
// 위의 MyClass1, 과 MyClass2 모두 Object를 extends하고 있고, 해당부분 생략가능.

// MyClass2에서는 Object클래스의 toString메소드를 상속받고, override 재정의 --> 문자그대로 나옴 "마이클래스2"
// MyClass1은 참조주소값으로 나옴 --> lang01Obj.MyClass1@1b6d3586

public class ObjToStringTest {
    public static void main(String[] args) {
        MyClass1 c1 = new MyClass1();
        MyClass2 c2 = new MyClass2();
        System.out.println(c1); // lang01Obj.MyClass1@1b6d3586
        System.out.println(c2); // 마이클래스2
    }
}
