package exercises.java;

public class StringLength {

	public static void main(String[] args) {
		int i=0;
		String text = "Praveen";
		char[] textarray = text.toCharArray();
		for (char c : textarray)
			i++;
		
		System.out.println("Length of String is : " +i);
	}

}
