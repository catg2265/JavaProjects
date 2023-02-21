package Lecture3;

import java.util.Scanner;

public class Opg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give 2 seperate integers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b)
			System.out.println(a);
		else 
			System.out.println(b);
		
		sc.close();
		
	}

}
