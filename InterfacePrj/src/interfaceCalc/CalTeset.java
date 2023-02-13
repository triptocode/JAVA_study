package interfaceCalc;

public class CalTeset {
	
	public static void main(String[] args) {
	
		// Calc 타입으로 하면 showInfo는 없어서 19번줄만 오류남 
		// Calc calc = new CompleteCalc();
		CompleteCalc calc = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		calc.showInfo();
	}

}
