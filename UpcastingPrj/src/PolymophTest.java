public class PolymophTest {
	public static void main(String[] args) {
		
		System.out.println("========== 객체B를 참조,바라보고 반환타입은 A ==========");
		A a = new B(); // Class B extends A 안되어있으면 업캐스팅 오류
		a.m();
		a.mAonly();
		// a.mBonly(); 는 에러, 사용불가
		
		System.out.println("========== 객체B를 참조,바라보고 반환타입도 B ==========");
		B b = new B();
		b.m();
		b.mAonly();
		b.mBonly();
	}
}
