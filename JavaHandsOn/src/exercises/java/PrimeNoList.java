package exercises.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNoList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int input;
		System.out.println("Enter the no to print the list of prime no's:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());

		for(int i=2;i<=input; i++){
			if(checkPrimeOrNot(i))
				System.out.print(i+" ");
		}

	}


	public static boolean checkPrimeOrNot(int input){
		int flag=0;
		if (input<=1)
			return false;
		else if (input==2)
			return true;
		else {
			for(int i=2; i<=input/2;i++) {
				if(input%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==1)
				return false;
			else
				return true;
		}
	}
}
