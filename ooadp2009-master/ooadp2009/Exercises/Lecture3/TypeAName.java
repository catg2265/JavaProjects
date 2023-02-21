
package Lecture3;

import java.util.Scanner;


public class TypeAName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please write your name: ");
		
		String name = sc.next();
		System.out.println("Hello " + name + "!");
		
		
		sc.close();
		
	}

}
