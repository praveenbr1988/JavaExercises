package com.lao.javaLearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//Fibonacci series say 0, 1, 1, 2, 3, 5, 8, 13,
		int input, num3;
		int num1=0;
		int num2 =1;
		System.out.println("Enter the no upto which you need Fibonacci series:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());
		
		System.out.print(num1+","+num2);
		
		for(int i=1;i<=input;i++) {
			num3=num1+num2;
			System.out.print(","+num3);
			num1=num2;
			num2=num3;
		}
		

	}

}
