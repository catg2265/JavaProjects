package Lecture3;

import java.util.Scanner;

public class Opg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("GIve 2 seperate strings: ");
		
		String a = sc.next();
		String b = sc.next();
		
		if (a.compareToIgnoreCase(b) > 0)
			System.out.println(b);
		else 
			System.out.println(a);
		sc.close();
	}

}
