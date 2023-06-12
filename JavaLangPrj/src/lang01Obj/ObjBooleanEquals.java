package lang01Obj;

public class ObjBooleanEquals {

    // boolean equals(Object obj) 메소드
    // 두 객체 변수 비교, 두 변수의 참조값이 같을때 true 반환

    public static void main(String[] args) {

        Integer a = new Integer(5);
        Integer b = 5;
        short c = 5;
        Integer d = new Integer(10);
// 변수에 담긴 값 관찰
        System.out.println(a); //5
        System.out.println(b); //5

// 비교 시작
        System.out.println(a.equals(b)); // true  "equals"는 값끼리 비교 ,"=="는 원시 primitive 타입끼리 비교해서  Wrapper class와 비교시 무조건 false
        System.out.println(a==b); // false        "== 는 객체의 주소값을 비교하기에 primitive와 Wrapper class 비교는 주의

        System.out.println(a.equals(c)); // false
        System.out.println(a==c); // true

        System.out.println(a.equals(d)); // false



    }


// 방법2 -  main 메소드는 static메소드이고, 이 메소드는 static하지 않은 필드(= 변수) 사용 x
//      -  오류 : 그래서 main 밖에 static 을 안붙인 변수를 생성하고  main 에서 사용하면 에러가나지만 static을 붙이니 오류안남
//    static Integer a = new Integer(5);
//    static Integer b = new Integer(10);
//    static Integer c = 5;
//    static short d = 5;
//
//    public static void main(String[] args) {
//
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equals(d));
//
//        System.out.println(a==b);
//        System.out.println(a==c);
//    }
}
