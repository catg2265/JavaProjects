package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q10. Write a program that asks the user for 10 Strings and prints out the one
 * that comes latest in the dictionary.
 */
public class Session3Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a string and press ENTER: ");
		String latest = sc.nextLine();
		for(int i = 0; i < 9; i++) {
			System.out.print("Please enter another string and press ENTER: ");
			String thisString = sc.nextLine();
			if (thisString.toLowerCase().compareTo(latest.toLowerCase()) > 0)
				latest = thisString;
		}
		System.out.println("The alphabetically last string you entered was: "+latest);
		sc.close();
	}
}
