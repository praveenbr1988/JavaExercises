package leetcodePractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 121;
		System.out.println(checkPalindromeNO(x));


	}

	public static boolean checkPalindromeNO(int x){

		if(x<0)
			return false;

		int copy =x;
		int reversedno=0;

		while (copy>0) {
			reversedno=(reversedno*10) +(copy%10);
			copy=copy/10;
		}

        return reversedno == x;
	}





}
