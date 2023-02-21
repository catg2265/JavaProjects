package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q1. Write a program that asks the user for his or
 * her name and then prints out a greeting that includes
 * the user's name.
 */
public class Session3Question01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name (and then press ENTER): ");
		String name = sc.next();
		System.out.println("Hello, "+name+"!");
		sc.close();
	}
}
