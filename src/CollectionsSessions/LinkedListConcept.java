package CollectionsSessions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		
		//print:
		
		System.out.println("Content of LinkedList: "+ ll);
		
		//addFirst
		ll.addFirst("Ramya");
		
		//addLast
		ll.addLast("GG");
		
		System.out.println("Content of LinkedList: "+ ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of LinkedList: "+ ll);
		
		ll.remove(2);
		System.out.println("Content of LinkedList: "+ ll);
		
		//how to print all the values of LinkedList;
		//for loop
		System.out.println("**********Using for loop");
		for(int i=0;i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		
		//advance for loop
		System.out.println("**********Using for each loop");
		for(String str: ll) {
			System.out.println(str);
		}
		
		
		//iterator
		System.out.println("**********Using for iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) { // if next item is there 
			System.out.println(it.next());
		}
		
		
		//while loop
		System.out.println("**********Using While loop");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}