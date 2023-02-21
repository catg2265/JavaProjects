package dk.aau.imi.med4.ooadp2009.javaintro;

import java.util.Scanner;

/**
 * This shows how to do simple text-based user input to a Java program in
 * eclipse. Just type directly in the Console window when the program asks you
 * to.
 * 
 * Can also be done from the command line as long as you are in the bin directory.
 */
public class JavaIntro08UserInput {
	public static void main(String[] args) {

		/*
		 * First we have to create an instance of the Scanner class and give it
		 * System.in as its argument. System.in is Java's name for the Console
		 * window when it is being used as an input stream.
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * Let's first read an int from the Console. Note that we use the print
		 * method, not the println method because we don't want to print out a
		 * new line before the user enters the number.
		 */
		System.out.print("Please input an integer: ");

		/*
		 * The following line tells the scanner object, sc, to read a token from
		 * the Console and interpret as an int.
		 */
		int i = sc.nextInt();
		System.out.println("You entered the integer, " + i + ", " + i
				+ "/2 == " + (i / 2));

		/*
		 * Now let's ask for the user's name and read it as a String from the
		 * Console.
		 */
		System.out.print("Now please type your name: ");
		String s = sc.next();
		System.out.println("Hello, " + s + "!");

		/*
		 * Now let's get the user to input a double.
		 */
		System.out.print("Now enter a floating point value: ");
		double d = sc.nextDouble();
		System.out.println("You entered the value, " + d + ", " + d
				+ " / 2 == " + (d / 2));

		/*
		 * Always close a Scanner object when you're finished with it.
		 */
		sc.close();
	}
}
