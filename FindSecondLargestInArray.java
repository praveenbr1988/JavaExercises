package com.lao.javaLearning;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] items = {200,10,56,85,36,97,100};
		int arraysize;
		arraysize= items.length;
		Arrays.sort(items);
		System.out.println(items[arraysize-2]);				
	}

}
