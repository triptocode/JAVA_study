class B extends A {
	
	// A,B클래스 모두에 있는 m()메서드에 @override 안써도 덮어쓰기는 가능!
    // 그렇다면, @Override 어노테이션을 안써도 되는데 표기하는 이유? 설명의 가독성?과 명확한 코드설계? 
	
	@Override 
	public void m() {
		System.out.println("method of B");
	};
	
	// mBonly()메서드는 B클래스에서만 사용하여 @Override표기시 오류
	public void mBonly() {System.out.println("not A method");}
}
