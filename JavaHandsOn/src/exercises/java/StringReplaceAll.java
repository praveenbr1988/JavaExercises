package exercises.java;

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

		
		
	}

}
