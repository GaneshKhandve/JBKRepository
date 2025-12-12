package com.gk;

public class Calculator {
	
	public int addition (int a , int b) {
		int c = a +b;
		return c;
	}
	
	public float avg (int a,int b) {
		Calculator c1 = new Calculator();
		int result = c1.addition(a, b);
		float average = (float)result/2;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		
		int addition = calc.addition(10, 15);
		System.out.println("addition = "+addition);
		
		float avg = calc.avg(10, 15);
		System.out.println("Average = "+avg);
		
		float avg2 = calc.avg(45, 47);
		System.out.println("Average = "+avg2);

	}

}
