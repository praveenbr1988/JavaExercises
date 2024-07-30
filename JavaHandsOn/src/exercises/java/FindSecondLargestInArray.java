package exercises.java;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] items = {200,10,56,85,36,97,100};
		int arraysize;
		arraysize= items.length;
		Arrays.sort(items);
		System.out.println(items[arraysize-2]);

		largestNo(items);
		smallestNo(items);
	}

	public static void largestNo(int[] items){

		int largest=items[0];

		for(int i=1; i< items.length; i++){
			if(items[i]>largest){
				largest=items[i];
			}
		}
		System.out.println("Largest No is: "+largest);

	}

	public static void smallestNo(int[] items){

		int smallest=items[0];

		for(int i=1; i< items.length; i++){
			if(items[i]<smallest){
				smallest=items[i];
			}
		}
		System.out.println("smallestNo No is: "+smallest);

	}

}
