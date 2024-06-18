package streamsExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,2,3);

		//Approach1
		Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(dup);
		
		//Approach2
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> dup1 = list.stream().filter(a-> !dupNum.add(a)).collect(Collectors.toSet());
		System.out.println(dup1);
		
		Set<Integer> distinct = list.stream().collect(Collectors.toSet());
		System.out.println(distinct);
		
	}

}
