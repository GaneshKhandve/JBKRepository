package com.gk.oct17;

public class BitwiseTernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;     // 0101  
		int b = 3;     // 0011  
		System.out.println(a & b | a ^ b);

		
		int x = 8;
		System.out.println(~x << 1);
		
		int c = 4, d = 7;
		int result = ((c & 1) == 0) ? (d >> 1) : (d << 1);
		System.out.println(result);
		
		int e = 5, f = 10, g = 15;
		int res = (e > f) ? (f > g ? f : g) : (e & f);
		System.out.println(res);
		
		int z = 5, y = 10;
		z = z ^ y ^ (y = z);
		System.out.println(z + " " + y);

	}

}
