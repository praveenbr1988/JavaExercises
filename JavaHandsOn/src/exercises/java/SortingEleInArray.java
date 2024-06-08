package exercises.java;

import java.util.Arrays;
import java.util.Collections;

public class SortingEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 40,2,1,50,3};
		int b[] = { 40,2,1,50,3};
		Integer c[] = { 40,2,1,50,3};
		System.out.println("Before Sorting , Array looks like "+Arrays.toString(a));
		
		//Approach 1		
		Arrays.parallelSort(a);
		System.out.println("After Sorting , Array looks like "+Arrays.toString(a));
		
		//Approach 2		
		Arrays.sort(b);
		System.out.println("After Sorting , Array looks like "+Arrays.toString(b));
		
		//Reverse Order
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("After Sorting , Array looks like "+Arrays.toString(c));
	}

}








