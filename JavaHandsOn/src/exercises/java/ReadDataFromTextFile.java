package exercises.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		approach1();
		approach2();			
	}
	
	public static void approach1() throws IOException {		//using FileReader and Buffered Reader

		FileReader fr = new FileReader("c:\\");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while(br.readLine() != null) {
			str=br.readLine();
			System.out.println(str);
		}
		br.close();
		fr.close();		
		return;
	}
	
	public static void approach2() throws IOException {		//Using Scanner and FIle

		FileReader fr = new FileReader("c:\\");
		Scanner sc = new Scanner(fr);
		
		String str;
		while(sc.hasNextLine()) {
			str=sc.nextLine();
			System.out.println(str);
		}
		sc.close();
		fr.close();		
		return;
		
	}	
	
	
	
}
