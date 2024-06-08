package exercises.java;

public class ReverseWordsinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String givensent = "I Love India";
		String reversesent="";
		String[] arraystring =givensent.split("\\s");
		int length = arraystring.length;		

		for (int i =length-1; i>=0; i--)
			reversesent= reversesent+arraystring[i]+" ";

		System.out.println(reversesent);
	}
}
