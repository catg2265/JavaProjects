package Lecture3;

import java.util.Scanner;

public class Opg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The purpose of the program is to take the sum of two double values");
		
		System.out.print("Write the first double here: ");
		double a = sc.nextDouble();
		System.out.print("Write the second double here: ");		
		double b = sc.nextDouble();
		System.out.println("The sum of the doubles are " + (a+b));
		sc.close();
	}

}
