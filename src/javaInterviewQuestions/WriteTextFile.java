package javaInterviewQuestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("H:\\Edureka\\Selenium\\WriteTextFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi Welecome to Selenium WebDriver");
		bw.newLine();
		bw.write("Basics of programming");
		bw.close();

	}

}
