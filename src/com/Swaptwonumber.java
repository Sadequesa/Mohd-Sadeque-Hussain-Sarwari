package com;

public class Swaptwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first = 2.50f, second = 4.50f;
		System.out.println("--Before Swap--");
		System.out.println(" First number" + first);
		System.out.println("Second Number" + second);
		
		float temporary = first;
		first = second ;
		second = temporary;
		
		System.out.println("-- After Swap--");
		System.out.println("First number" + first);
		System.out.println("Second number" + second);
	}

}
