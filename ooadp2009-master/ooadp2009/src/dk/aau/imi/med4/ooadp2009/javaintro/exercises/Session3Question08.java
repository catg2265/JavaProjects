package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q8. Write a program that asks the user for 10 doubles and prints out the
 * largest number.
 */
public class Session3Question08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a floating point number and press ENTER: ");
		double greatest = sc.nextDouble(); sc.nextLine();
		for (int i = 0; i < 9; i++) {
			System.out.print("Please enter the next floating point number and press ENTER: ");
			double thisNumber = sc.nextDouble(); sc.nextLine();
			if (thisNumber > greatest)
				greatest = thisNumber;
		}
		System.out.println("The greatest number you entered was " + greatest);
		sc.close();
	}
}
