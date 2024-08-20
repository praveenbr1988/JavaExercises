package exercises.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialNo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int input;
		System.out.println("Enter the no to print the list of prime no's:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());

		//Approach 1
		//System.out.println("Factorial of a given no: "+findFactorial(input));

		//Approach 2
		System.out.println("Factorial of a given no: "+recursiveWay(input));
	}

//5*4*3*2
	public static int findFactorial(int input){
		int fact=1;
		for(int i=input; i>1;i--) {
			fact = fact * i; //1*5   fact =5;
		}
		return fact;
	}


	//Recursive Function
	public static int recursiveWay(int input){
		int fact=1;
		while(input>1){
			return  input * recursiveWay(input-1) ; //1*5   fact =5;
		}
		return fact;
	}
}
