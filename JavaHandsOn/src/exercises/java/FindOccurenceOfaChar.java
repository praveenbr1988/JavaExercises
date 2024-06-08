package exercises.java;

public class FindOccurenceOfaChar {
	public static void withIteration() {
		String input = "Agniprasath";
		char tofind = 'a';
		int occurence=0;
		input= input.toLowerCase();
		char[] inputarr= input.toCharArray();
		for (char c : inputarr) {
			if(c == 'a') {	
				occurence++;
			}
		}
		System.out.println(occurence);
	}
	
	public static void withoutIteration() {
		String input = "Agniprasath";
		input= input.toLowerCase();
		int lengthofstring=input.length();
		
		char tofind = 'a';
		String tofindstring = Character.toString(tofind);
		
		int occurence=0;		
		
		input = input.replace(tofindstring, "");
		int lengthofstringafterreplace=input.length();
		
		occurence=lengthofstring-lengthofstringafterreplace;
		System.out.println(occurence);
		
		
	}
	
	public static void main(String[] args) {
		//withIteration();
		withoutIteration();
		
	}
}
