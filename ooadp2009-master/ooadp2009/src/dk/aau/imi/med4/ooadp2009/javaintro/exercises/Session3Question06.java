package dk.aau.imi.med4.ooadp2009.javaintro.exercises;

import java.util.Scanner;

/**
 * Q6. Write a program that asks the user for 10 integers and then prints out
 * the numbers in the reverse order from that in which they were entered by the
 * user.
 */
public class Session3Question06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[10];
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("Please enter integer number "+(i+1)+" and press ENTER: ");
			intArray[i] = sc.nextInt(); sc.nextLine();
		}
		sc.close();
		System.out.println("The numbers you entered in reverse order are:");
		for(int i = 9; i >= 0; i--)
			System.out.println(intArray[i]);
	}
}
