package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q5. Write a program that asks the user for two Strings and prints out the one
 * that comes earlier in the dictionary. (Hint: Use the String compareTo method
 * to find out which of two Strings comes first alphabetically. For example, if
 * a.compareTo(b) == -1 then a comes before b.)
 * 
 * Actually, a.compareTo(b) < 0 => a is less than b in UTF-8.
 */
public class Session3Question05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a string and press ENTER: ");
		String s1 = sc.nextLine(); //Using nextLine instead of next allows spaces.
		System.out.print("Please enter a second string and press ENTER: ");
		String s2 = sc.nextLine();
		String alphabeticallyEarlier = "";
		if (s1.compareTo(s2) < 0) // a.compareTo(b) is less than 0 if a < b,
								  // greater than 0 when a > b and equal to
								  // zero when a is the same as b.
			alphabeticallyEarlier = s1;
		else
			alphabeticallyEarlier = s2;
		System.out.println("The alphabetically earlier of the two strings you entered was \""
						+ alphabeticallyEarlier
						+"\"");
		sc.close();
	}
}
