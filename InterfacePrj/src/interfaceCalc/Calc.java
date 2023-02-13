package interfaceCalc;

// interface는 부모클래스로 사용되는abstract와 같다 
// abstract클래스안에는 일반메서드도 있다면, interface는 모두 abstract 메서드로{} 구현부가 없다.
public interface Calc {

// public static final double PI = 3.14; 와 동일한데, 하단코드처럼 public static final 생략가능 
	double PI = 3.14;  
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
