package exercises.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "320 Items found";
		System.out.println(str);
		str = str.replaceAll("[a-zA-Z]","");
		str = str.trim();
		System.out.println(str);
		int no;
		no = Integer.parseInt(str);
		System.out.println(no);
				
		/*
		 * try { no = Integer.parseInt(str);
		 * 
		 * } catch(NumberFormatException e){ no=0; }
		 */
		
		//System.out.println(no);

		pattermatch();
		
	}



	public static void pattermatch(){

		// Original string
		String originalString = "The year 2024 will be great! My number is 123-456-7890.";

		// Regular expression to match all digits
		String regex = "\\d";

		// Create a Pattern object
		Pattern pattern = Pattern.compile(regex);

		// Create a Matcher object
		Matcher matcher = pattern.matcher(originalString);

		// Replace all matches with #
		String resultString = matcher.replaceAll("#");

		// Print the original and the resulting strings
		System.out.println("Original String: " + originalString);
		System.out.println("Resulting String: " + resultString);
	}

}
