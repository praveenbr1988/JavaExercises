package exercises.java;
import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabetsinString {
	public static void main(String[] args) {

		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String input = "This is my sentence";
		input=input.toLowerCase();
		input = input.replaceAll(" ", "");
		String[] inputarray = input.split("");
		String[] alphabetarray = alphabets.split("");
		HashSet<String> set1 = new HashSet<String>();
		for (String string : inputarray) {
			set1.add(string);
		}	
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabetarray));
		set2.removeAll(set1);
		System.out.println(set2);
	}
}
