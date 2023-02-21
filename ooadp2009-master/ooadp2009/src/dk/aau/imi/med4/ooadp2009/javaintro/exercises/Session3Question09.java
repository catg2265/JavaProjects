package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q9. Write a program that asks the user for 10 doubles and prints out the mean.
 */
public class Session3Question09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a floating point number and press ENTER: ");
		double sum = sc.nextDouble(); sc.nextLine();
		for (int i = 0; i < 9; i++) {
			System.out.print("Please enter the next floating point number and press ENTER: ");
			sum += sc.nextDouble(); sc.nextLine();
		}
		System.out.println("The mean of the numbers you entered was " + (sum/10));
		sc.close();
	}
}
