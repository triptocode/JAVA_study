public class ImplicitConversion {
    public static void main(String[] args) {

        // 데이터 타입 크기
        //  byte 1, short 2 , int 4, long 8 // 실수: float 4, double 8  // boolean 1 , char 2

        byte bNum=10;
        int iNum= bNum;
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum2 = iNum2;    // int 와 float 모두 4byte, 더 정밀한 표현( 정수->소수)은 묵시적 형변환으로 정상작동
        System.out.println(fNum2); // 20.0

//        float fNum3 = 20.1;
//        int iNum3 = fNum3;    // 오류 발생! ( 둘다 4byte 이지만, 소수->정수는 더 정밀한 표현이 아니여서 error)

        double dNum = fNum2+ iNum; // (fNum2 + iNum이 float 4바이트로 변형) --> double 8바이트로 변형되어 저장
        System.out.println(dNum); // 30.0
    }
}