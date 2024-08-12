package exercises.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

	public static void usingownLogic() {
		String text = "Malayalam";
		char []arrtext= text.toCharArray();
		String reversed="";
		for(int j=arrtext.length-1; j>=0; j--)
			reversed=reversed+arrtext[j];
		
		System.out.println(reversed);
		
		if(text.equalsIgnoreCase(reversed))
			System.out.println("Palindrome");
		else
			System.out.println("not a Palindrome");
	}
	
	
	public static void usingCollections() {
		
		String text = "Agni";
		char []arrtext= text.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		for (Character ch : arrtext) {
			list.add(ch);
		}
		Collections.reverse(list);

		 ListIterator iterator = list.listIterator(); 
		 while(iterator.hasNext()) {
		 System.out.print(iterator.next()); 
		 }

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//usingownLogic();
		usingCollections();
//		String s = String.join("-","19","05","2002");
//		System.out.println(s);

	}
}
