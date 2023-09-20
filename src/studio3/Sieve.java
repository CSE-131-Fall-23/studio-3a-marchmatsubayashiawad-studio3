package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("What would you like n to be?");
	int n = in.nextInt();
	int[] numbers = new int[n];
	int value = 2;
	
	for (int i=0; i < numbers.length - 1; i++) { //initializing array
		numbers[i] = value;
		value++;
	}//end for loop
	for (int i=2; i < numbers.length -1; i=i+2) { //multiples of two
		numbers[i] = 0;
	}
	for (int i=4; i < numbers.length -1; i=i+3) { //multiples of three
		numbers[i] = 0;
	}
	for (int i=8; i < numbers.length -1; i=i+5) { //multiples of five
		numbers[i] = 0;
	}
	for (int i=12; i < numbers.length -1; i=i+7) { //multiples of seven
		numbers[i] = 0;
	}
	for (int i=0; i < numbers.length -1; i++) { //print
		if (numbers[i] != 0) {
			System.out.print(numbers[i] + " ");	
		}
	}
	
	}//end main
}//end class
