package exercises.java;

import java.util.Scanner;

public class ReverseANo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenno;
		System.out.println("Enter a No:");
		Scanner scanner = new Scanner(System.in);
		givenno = scanner.nextInt();

		int reversedno=0;
		while (givenno>0) {
			reversedno=reversedno*10;
			reversedno=reversedno+(givenno%10);
			givenno=givenno/10;			
		}
		System.out.println(reversedno);

		//Using StringBuffer
		usingStringBuffer(56);


	}

	public static void usingStringBuffer(int givenno){

		StringBuffer sb = new StringBuffer(String.valueOf(givenno)).reverse();

		System.out.println("Reversed No UsingStringBuffer is: "+sb);
	}

}
