package javaInterviewQuestions;

public class B extends A {

	public void display() {
		super.display();
		System.out.println("B method");
	}
	
	
	public void show() {
		System.out.println("show");
	}
	
	public static void main(String[] args) {
		
		A a = new B();
		a.display();
	
		
		
	}

}
