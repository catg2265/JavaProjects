package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q3. Write a program that asks the user for two 
 * ints and prints out the smallest of the two numbers.
 */
public class Session3Question03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer and press ENTER: ");
		int i1 = sc.nextInt(); sc.nextLine();
		System.out.print("Please enter a second integer and press ENTER: ");
		int i2 = sc.nextInt(); sc.nextLine();
		int smaller = 0;
		if (i1 < i2)
			smaller = i1;
		else
			smaller = i2;
		System.out.println("The smaller of the two numbers you entered was "+smaller);
		sc.close();
	}
}
