package com.lao.javaLearning;

import java.util.Arrays;

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
	}
}
