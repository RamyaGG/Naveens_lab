package javaInterviewQuestions;
														/*
	    *
        **
        ***
        ****
        *****
														*/
public class StarPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Inverted half Pyramid
		System.out.println("");
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*" + "");
			}
			System.out.println();
		}
														/*
		*
		***
		*****
		*******
		*********                                        */
		System.out.println();
		int x = 5;
		int p = 0;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i + p; j++) {
				System.out.print("*");
			}
			System.out.println();
			p = p + 1;
		}
	}
}
