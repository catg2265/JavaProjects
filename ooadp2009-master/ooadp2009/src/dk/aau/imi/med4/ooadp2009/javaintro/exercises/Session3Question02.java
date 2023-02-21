package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q2. Write a program that asks the user for two doubles
 * and prints out the sum of the two numbers.
 */
public class Session3Question02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a floating point number and press ENTER: ");
		double d1 = sc.nextDouble(); sc.nextLine();
		System.out.print("Please enter a second floating point number and press ENTER: ");
		double d2 = sc.nextDouble(); sc.nextLine();
		System.out.println(""+d1+" + "+d2+" = "+(d1+d2));
		sc.close();
	}
}
