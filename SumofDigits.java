package com.lao.javaLearning;

public class SumofDigits {

	public static void main(String[] args) {
		// 1+2+3
		int input=123;
		int sum=0;
		while(input>0){
			int rem =input%10;
			sum=sum+rem;
			input=input/10;
		}	
		System.out.println("sum of digits: "+sum);	
	}
}
