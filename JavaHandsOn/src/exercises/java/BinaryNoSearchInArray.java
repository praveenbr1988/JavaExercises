package exercises.java;

import java.util.Arrays;

public class BinaryNoSearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //should be in sorted order
		int key = 100;
		int l = 0;
		int h = a.length - 1;
		int mid = 0;
		boolean flag = false;
		while (l <= h) {
			mid = (l + h) / 2;
			if (a[mid] == key) {
				System.out.println("Key found!  " + "Position is " + a[mid]);
				flag = true;
				break;
			}
			if (key < a[mid]) {
				h = mid - 1;
			}
			if (key > a[mid]) {
				l = mid + 1;
			}
		}
		if (flag == false) {
			System.out.println("Ele not found");
		}
		
		//approach 2 using Arrays.binarysearch()
		System.out.println("Using approach 2");
		System.out.println(Arrays.binarySearch(a, 8));

		

	}

}
