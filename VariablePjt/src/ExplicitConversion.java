public class ExplicitConversion {

    public static void main(String[] args) {
        int i =1000;
        byte b = (byte)i;
        System.out.println(b); // -24 ( 데이터 유실 발생, 덜 정밀한 형태 즉, 소수 -> 정수로  명시적 형변환시 발생)

        // 덜 정밀한 형변환인 경우, 소수점 버림을 하고 연산
        float f = 0.9F;
        double d = 1.2;

        int iNum1 = (int)f +(int)d;
        int iNum2 = (int) (f+d);
        System.out.println(iNum1); // 1 : f와 d 각각 소수점 버림하여 더하면 0+1 = 1
        System.out.println(iNum2); // 2 : 0.9 + 1.2 = 2.1 에서 소수점 버림하면 2

    }
}
