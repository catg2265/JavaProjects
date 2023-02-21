package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q12. Write a program that asks the user to enter 10 Strings and then prints
 * out the Strings in alphabetical order.
 */
public class Session3Question12 {
	public static void main(String[] args) {
		String[] ar = new String[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Please enter a string number: ");
			ar[i] = sc.nextLine();
		}

		/*
		 * Now we use a simple sorting algorithm, called insertion sort, to sort
		 * the numbers. For details, see pages 2-4 of Cormen, T. H., Leiserson,
		 * C. E. and Rivest, R. L. (1990). Introduction to Algorithms. MIT
		 * Press.
		 */

		for (int j = 1; j < ar.length; j++) {
			String k = ar[j];
			int i = j - 1;
			while (i >= 0 && ar[i].toLowerCase().compareTo(k.toLowerCase()) > 0) {
				ar[i + 1] = ar[i];
				i--;
			}
			ar[i + 1] = k;
		}

		System.out.println("The strings you entered in alphabetical order were: ");
		for (int i = 0; i < 10; i++)
			System.out.println(ar[i]);
		sc.close();
	}
}
