package com.lao.javaLearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNoEx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int flag=0;
		int input;
		System.out.println("Enter the no to check whether it is a prime or not:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());

		if (input==0 || input==1)
			System.out.println(input +" is not a prime no");
		else if (input==2)
			System.out.println(input +" is a prime no");
		else {
			for(int i=2; i<=input/2;i++) {
				if(input%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==1) 
				System.out.println(input + " is not a prime no");
			else
				System.out.println(input + " is a prime no");
		}
	}
}
