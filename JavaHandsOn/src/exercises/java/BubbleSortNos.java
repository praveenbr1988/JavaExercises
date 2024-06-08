package exercises.java;

import java.util.Arrays;

public class BubbleSortNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[] = { 40,2,1,50,3};
		int temp=0;		
		System.out.println("Before Sorting , Array looks like "+Arrays.toString(a));		
		int pass = a.length-1;		
		for(int i=0;i<pass;i++) {	// No of passes	
			for(int j=0; j<pass; j++) {	// No of iterations
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}			
		}
		System.out.println("After Sorting , Array looks like "+Arrays.toString(a));

	}

}
