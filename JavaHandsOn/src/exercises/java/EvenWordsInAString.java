package exercises.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenWordsInAString {

	public static void main(String[] args) {

//		String s = "The world is not a fair";
//		String[] strarr = s.trim().split(" ");
//		for(int i=1; i< strarr.length; i=i+2){
//			System.out.println(strarr[i]);
//		}


		//Using Stream
		String s = "The world is not a fair";
		String[] strarr = s.trim().split(" ");
		List lists = new ArrayList(Arrays.asList(strarr));

		IntStream.range(0, lists.size())
				.filter(i -> i % 2 != 0)
				.mapToObj(i->lists.get(i))
				.forEach(System.out::println);


		
	}

}
