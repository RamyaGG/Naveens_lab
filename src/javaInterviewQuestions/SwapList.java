 package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(8);
		al.add(19);
		System.out.println("Before swapping "+al);
		Collections.swap(al, 1, 3); //1 and 3 are indexes here
		System.out.println("After swapping "+al);
		Collections.reverse(al);
		System.out.println("After Reverse "+al);
		Collections.replaceAll(al, 8, 7);
		System.out.println("After Replace 8 "+al);
	
	}


}
