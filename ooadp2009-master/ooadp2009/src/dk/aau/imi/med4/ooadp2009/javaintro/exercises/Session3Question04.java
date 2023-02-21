package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q4. Write a program that asks the user for two 
 * ints and prints out the largest of the two numbers.
 */
public class Session3Question04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer and press ENTER: ");
		int i1 = sc.nextInt(); sc.nextLine();
		System.out.print("Please enter a second integer and press ENTER: ");
		int i2 = sc.nextInt(); sc.nextLine();
		int larger = 0;
		if (i1 > i2)
			larger = i1;
		else
			larger = i2;
		System.out.println("The larger of the two numbers you entered was "+larger);
		sc.close();
	}
}
