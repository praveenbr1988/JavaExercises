package exercises.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1,2,3,4,7,6,8};
		Arrays.sort(array1);
		System.out.println("The missing No's are: ");
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}

		//Sum of elements in array
		int[] array2 = {1, 2, 3, 4, 7, 6, 8};
		List<Integer> l = Arrays.stream(array2)        // IntStream
				.boxed()               // converts int to Integer (boxing)
				.collect(Collectors.toList());

		int sum = l.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);

		int oddSum = Arrays.stream(array2)
				.filter(x -> x % 2 != 0)
				.sum();

		int max = Arrays.stream(array2).max().orElse(Integer.MIN_VALUE);
		int min = Arrays.stream(array2).min().orElse(Integer.MAX_VALUE);
		double avg = Arrays.stream(array2).average().orElse(0.0);
		int secondlargest = Arrays.stream(array2).distinct().boxed().sorted((a,b)->b-a).skip(1).findFirst().orElse(Integer.MIN_VALUE);


	}
}
