package com;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter any number");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if (num % 2 == 0)
			System.out.println("The ebtered number is even");
		else
			System.out.println("The entered number is odd");
		
	}

}
