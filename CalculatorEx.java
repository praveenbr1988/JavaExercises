package com.lao.javaLearning;
public class CalculatorEx {
	public int add(int a, int b){
	return a+b;		
	}	
	public double sub(double a, double b){
	return a-b;		
	}	
	public double mul(double a, double b){
	return a*b;		
	}	
	public int div(int a, int b){
	return a/b;		
	}
	
	public static void main(String[] args) {
		CalculatorEx op = new CalculatorEx();
		int sum = op.add(10, 5);
		double sub = op.sub(10, 5);
		double mul =  op.mul(10, 5);
		int div = op.div(10, 5);
		System.out.println("Addition result: "+sum);
		System.out.println("Subtraction result: "+sub);
		System.out.println("Multiplication result: "+mul);
		System.out.println("Division result: "+div);
	}
}
