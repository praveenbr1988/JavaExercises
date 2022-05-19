package com.lao.javaLearning;

public class FindIntersectionInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {10,25,36,10,58,74,36};
		int [] array2 = {10,26,36,10,59,74,37};
	
		
		for(int i=0;i<array1.length;i++) {
			
			for(int j=0;j<array2.length;j++) {
				
				if (array1[i]==array2[j]) {
					
					System.out.println(array1[i]);
					
				}
			}
		}
	}

}
