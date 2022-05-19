package com.lao.javaLearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNo {

	public static void main(String[] args) throws NumberFormatException, IOException {
			//(1*1*1)+(5*5*5)+(3*3*3)==Original No
		int input;
		int calc=0;
		int rem;
		System.out.println("Enter the no to find whether it is armstrong or not:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());
		int original=input;
		int digitsize = (Integer.toString(input)).length();
		while(input>0) {
			rem=input%10;		
			calc = (int) (calc + Math.pow(rem, digitsize));
			input=input/10;
		}	
		if(original==calc) 
			System.out.println("Given no is Armstrong");
			else 
				System.out.println("Given no is not Armstrong");
	}
}
