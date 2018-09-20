package javaInterviewQuestions;

/*Ciginiti Interview: Two interfaces I1(m1, m2 methods) and I2(m1, m3 methods) . Class X implents I1, I2. 
 * From new class Y how will you access I1 methods .     */
public class Y {
	public static void main(String[] args) {
		I1 i1= new X(); // with i1 i can only access m1 and m2
		i1.m1();
		i1.m2();
		
		X x = new X(); //with x i can access m1, m2, m3
		I2 i2 = new X(); //with i2 i can only access m1 and m3
		
	
	}
	
	

}
