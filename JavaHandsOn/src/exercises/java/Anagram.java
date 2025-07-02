package exercises.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {


//Convert both the string into chararray
//Sort both the char arrays
//Compare both the char arrays

		String s1="silents";
		String s2="listen";
		if(isAnagram(s1,s2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

 
		
	}


	public static boolean isAnagram(String s1, String s2) {

		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		return Arrays.equals(charArr1,charArr2);



	}





}
