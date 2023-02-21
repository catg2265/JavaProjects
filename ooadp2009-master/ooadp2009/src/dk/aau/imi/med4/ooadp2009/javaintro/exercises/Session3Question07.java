package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q7. Write a program that asks the user for 10 doubles and then prints out the
 * smallest number.
 */
public class Session3Question07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a floating point number and press ENTER: ");
		double least = sc.nextDouble(); sc.nextLine();
		for(int i=0; i < 9; i++) {
			System.out.print("Please enter the next floating point number and press ENTER: ");
			double thisNumber = sc.nextDouble(); sc.nextLine();
			if (thisNumber < least)
				least = thisNumber;
		}
		System.out.println("The least number you entered was "+least);
		sc.close();
	}
}
