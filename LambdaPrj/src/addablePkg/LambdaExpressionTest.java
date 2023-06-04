package addablePkg;

public class LambdaExpressionTest {
    // semicolor 위치- 오류주의
    public static void main(String[] args) {

        //익명클래스 - lambda 사용x
        Addable add1 = new Addable() {
            @Override
            public int add(int a, int b) {return (a+b);}
        };
        System.out.println(add1.add(10,10));

        // lambda 사용 - 첫번째 방식
        Addable add2 = (int a, int b)->{ return(a+b);};
        System.out.println(add2.add(20,20));

        // lambda 사용 - 두번째 방식
        Addable add3 = (a,b)->(a+b);
        System.out.println(add3.add(30,30));
    }
}
