package exercises.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateLettersInSentence {	
	public static void main(String[] args) {
	
		String inputString = "WWWWEELLLLCOMMMEE TTOOOO FIDEEEELITY";
		
		System.out.println("Before Format : "+inputString);
		approcach1(inputString);
		approcach2(inputString);
		approcach3(inputString);
		approcach4(inputString);
		
		
	}

	//Using SET interface
	private static void approcach1(String inputString) {
		
		System.out.println("****Using SET Interface****");		
		
		Set<Character> formattedChars = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<inputString.length(); i++) {
			formattedChars.add(inputString.charAt(i));
		}

		for(Character c: formattedChars) {
			sb.append(c);				
		}
		
		System.out.println("After Format, is: "+sb);
		
	}
	

	//Using Java8
	private static void approcach2(String inputString) {
		
		System.out.println("****Java Streams****");
		StringBuilder sb = new StringBuilder();
		inputString.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println("After Format, is: "+sb);
		
	}
	
	
	//Using IndexOf
	private static void approcach3(String inputString) {
		
		System.out.println("****Using Index of****");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<inputString.length();i++) {
			
			char ch = inputString.charAt(i);
			int index = inputString.indexOf(ch, i+1);
			
			if(index==-1) {
				sb.append(ch);
			}
		}
		
		System.out.println("After Format, is: "+sb);
		

		
	}
	
	
	//Using Character Array
	private static void approcach4(String inputString) {
		
		System.out.println("****Using Character Array****");
		char[] arrchar = inputString.toCharArray();
		StringBuilder sb = new StringBuilder();		
		for(int i=0; i<arrchar.length; i++) {
			boolean repeated =false;
			for(int j=i+1; j<arrchar.length; j++) {
				if(arrchar[i] == arrchar[j]) {
					repeated=true;
					break;
				}				
			}			
			if(!repeated) {
				sb.append(arrchar[i]);
			}
		}		
		System.out.println("After Format, is: "+sb);
		
	}
	
	
}
