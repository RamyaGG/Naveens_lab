package javaInterviewQuestions;

public class B extends A {

	public void display() {
		//super.display();
		System.out.println("B method");
		
	}
	
	
	public void show() {
		super.display();
		
		System.out.println("show");
	}
	
	public static void main(String[] args) {
	
		A a = new B();
		a.display();
		a.display1();
		//a.show() is not possible
		
		System.out.println("B Class Instance ================");
		B b = new B();
		b.show();
		b.display();
		b.display1();
	
		
		
	}

}
