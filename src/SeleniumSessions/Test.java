package SeleniumSessions;

public class Test {
	
	 static int i=5;
	 int j=6;

	 public static void main(String[] args) {
		Test test = null;
		System.out.println(Test.i); //5
		System.out.println(test.i); //5
		System.out.println(test);   //null

	}

}
