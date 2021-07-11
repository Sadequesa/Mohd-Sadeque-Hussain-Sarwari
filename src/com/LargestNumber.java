package com;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 5.5, n2 = 4.5, n3 = 6.5;
		if( n1 >= n2 && n1 >=n3)
		System.out.println( n1 + "is greatest");
		else if (n2 >= n3)
			System.out.println(n2+ "is greatest");
		else
			System.out.println( n3 + "is greatest");
	}

}
