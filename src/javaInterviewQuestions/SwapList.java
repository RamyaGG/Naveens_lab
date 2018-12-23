package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapList {
	public static void main(String[] args) {

		 ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(2);
		 al.add(4);
		 al.add(8);
		 al.add(19);
		 System.out.println("Before swapping "+al); //[2, 4, 8, 19]
		 Collections.swap(al, 1, 3); //1 and 3 are indexes here
		 System.out.println("After swapping "+al); //[2, 19, 8, 4]
		 Collections.reverse(al);
		 System.out.println("After Reverse "+al);  //[4, 8, 19, 2]
		 Collections.replaceAll(al, 8, 7);
		 System.out.println("After Replace 8 "+al);  //[4, 7, 19, 2]
		 

		String s = "Chiru nan maga mentalu loosu thikklu thu";
		String arr[] = s.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		Collections.reverse(arrList);
		
		for (String str : arrList) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		//Method 2
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
