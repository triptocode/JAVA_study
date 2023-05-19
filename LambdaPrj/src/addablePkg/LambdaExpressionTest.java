package addablePkg;

public class LambdaExpressionTest {

    public static void main(String[] args) {
        // semicolor 위치- 오류주의
        Addable add1 = new Addable() {
            @Override
            public int add(int a, int b) {return (a+b);}
        };
        System.out.println(add1.add(10,10));

        Addable add2 = (int a, int b)->{ return(a+b);};
        System.out.println(add2.add(20,20));

        Addable add3 = (a,b)->(a+b);
        System.out.println(add3.add(30,30));

    }
}
