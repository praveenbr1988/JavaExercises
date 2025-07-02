package exercises.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWordInString {

	public static void main(String[] args) {


//		String s = "The world is not a fair";
//
//		String[] strarr = s.trim().split(" ");
//		String lastword=strarr[strarr.length-1];
//		char[] chararr=lastword.toCharArray();
//		int cnt=0;
//		for(char c: chararr){
//			cnt+=1;
//		}
//		System.out.println("Length of last word:"+cnt);


		//Using Streams
		String s = "The world is not a fair";
		String[] strarr = s.trim().split(" ");
		List<String> listOfWords = new ArrayList<>(Arrays.asList(strarr));
		int len = listOfWords.stream().skip(listOfWords.size()-1).map(String::length).findFirst().orElse(0);

		System.out.println("Length of last word:"+len);
		
	}






}
