package exercises.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {

		String givenWord = "cbaebabacd";
		String anGrm = "abc";
		
		for(int i=0; i<givenWord.length()-3; i++) {
			String temp;
			temp = givenWord.substring(i, i+3);			
			
			//Convert the temp string into char array
			char[] temparr = temp.toCharArray();
			ArrayList<Character> tempList = new ArrayList<Character>();
			for(int j=0; j<temparr.length; j++) {
				tempList.add(temparr[j]);
			}
					
			System.out.println("tempList--" +tempList);
			
			//Sort the Char array and convert back to String
			
			//List result = tempList.stream().sorted((o1, o2)->o1.compareTo(o2)).collect(Collectors.toList());
			List<Character> sortedList = tempList.stream().sorted().collect(Collectors.toList());
			System.out.println("sortedList--" +sortedList);
			
			String formattedString= "";
			for(int k=0; k<sortedList.size(); k++) {
				formattedString = formattedString + sortedList.get(k);
			}     
               
			System.out.println("formattedString--" +formattedString);
			//Comparison
			if(formattedString.equals(anGrm)) {
				System.out.println("Index Position- "+i);
			}
		}
 
		
}
}
