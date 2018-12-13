 package javaInterviewQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {
		
			String s=null;
			FileReader fr = new FileReader("H:\\Edureka\\Selenium\\Ramya_Resume.doc");
			BufferedReader br=new BufferedReader(fr);
			
			while((br.readLine())!=null){
				System.out.println(br.readLine());
				System.out.println();
			}


	
	//Write a program to get maximum word count in a line from a file.
	

        int maxCount=0;
		BufferedReader brr=new BufferedReader(new FileReader("H:\\Edureka\\Selenium\\RamyaResume.doc"));
		while((s=brr.readLine())!=null){
			String arr[]=s.split(" ");
			int count=arr.length;
			if(count>maxCount){
			maxCount=count;
			}	
		}
		System.out.println(maxCount);

	 }
}
//To read the line print line in reverse order word by word
//String arr[] =  s.split(" ");
//ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr)); --> to convert array into arrayList
//Collections.reverse(al);
//System.out.println(al);
