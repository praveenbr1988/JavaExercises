package exercises.java;

public class CountOfWordsInString {
	
	public static void main(String[] args) {

		String input = "Welcome to Java World";
		String [] arrStr = input.split(" ");
		int countOfWords=arrStr.length;
		
		System.out.println("Count of Words:"+ countOfWords);
		
		
		
	}
}
