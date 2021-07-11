package com;
import java.util.Scanner;
public class FlyodsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, counter=1, i,j,number=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd Triangle");
		rows=input.nextInt();
		System.out.println("Flyod Triangle");
		System.out.println("*************************");
		for (counter =1; counter<=rows; counter++) {
			for (j=1; j<=counter; j++) {
				System.out.print(number +"  ");
				number++;
			}
			System.out.println();
		}
	}

}
