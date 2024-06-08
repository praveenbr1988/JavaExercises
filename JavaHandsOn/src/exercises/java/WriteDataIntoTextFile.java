package exercises.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		approach1();
		
	}
	
	public static void approach1() throws IOException {		//using FileWriter and BufferedWriter

		FileWriter fw = new FileWriter("c:\\");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Welcome to Java");
		bw.close();
		return;
	}
	

	
	
	
}
