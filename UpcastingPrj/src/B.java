class B extends A {
	@Override
	public void m() {
		System.out.println("method of B");
	};
	
	public void mBonly() {System.out.println("not A method");}
}
