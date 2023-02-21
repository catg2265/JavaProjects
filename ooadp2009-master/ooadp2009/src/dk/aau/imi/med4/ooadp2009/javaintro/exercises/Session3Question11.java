package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q11. Write a program that asks the user to enter 10 doubles and then prints
 * out the doubles in ascending order. Hints: if you want two or more things to
 * be true in order to satisfy a conditional, use the && operator for "and". For
 * example: if (x > 10 && x < 20) System.out.println(x); will only print out x
 * if it is greater than 10 and less than 20.
 */
public class Session3Question11 {
	public static void main(String[] args) {
		double[] ar = new double[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Please enter a floating point number: ");
			ar[i] = sc.nextDouble();
			sc.nextLine();
		}

		/*
		 * Now we use a simple sorting algorithm, called insertion sort, to sort
		 * the numbers. For details, see pages 2-4 of Cormen, T. H., Leiserson,
		 * C. E. and Rivest, R. L. (1990). Introduction to Algorithms. MIT
		 * Press.
		 */

		for(int j = 1; j < ar.length; j++) {
			double k = ar[j];
			int i = j - 1;
			while (i >= 0 && ar[i] > k) {
				ar[i+1] = ar[i];
				i--;
			}
			ar[i+1] = k;
		}
		
		System.out.println("The numbers you entered in ascending order were: ");
		for (int i = 0; i < 10; i++)
			System.out.println(ar[i]);
		sc.close();
	}
}
