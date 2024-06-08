package exercises.java;

public class ReverseEachWordsinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		approach1();
		approach2();			
	}
	
	public static void approach1() {		
		String givensent = "Welcome to Java";
		String[] words =givensent.split(" ");
		String reversedwords="";
		for(String w: words) {
			String reversedWord="";
			for(int i=w.length()-1; i>=0; i--) {				
				reversedWord = reversedWord+ w.charAt(i);
			}
			reversedwords = reversedwords+ reversedWord +" ";
		}
		System.out.println(reversedwords);
		return;
	}
	
	public static void approach2() {		
		String givensent = "Welcome to Java program";
		String[] words =givensent.split(" ");
		String reversedSent="";
		for(String w: words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversedSent = reversedSent + sb.toString() +" ";
		}
		System.out.println(reversedSent);
		return;
	}	
	
	
	
}
