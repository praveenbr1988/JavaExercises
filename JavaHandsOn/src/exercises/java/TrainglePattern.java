package exercises.java;

import java.util.Scanner;

public class TrainglePattern {

	
	public static void usingstar() {
		
		int nooflines;
		System.out.println("Enter No of Lines:");
		Scanner scanner = new Scanner(System.in);
		nooflines = scanner.nextInt();
		for(int row=0;row<nooflines;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
public static void usingno() {
		
		int nooflines;
		int startno=1;
		System.out.println("Enter No of Lines:");
		Scanner scanner = new Scanner(System.in);
		nooflines = scanner.nextInt();
		for(int row=0;row<nooflines;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print(startno);
				startno++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		usingstar();
		usingno();
	}
}
