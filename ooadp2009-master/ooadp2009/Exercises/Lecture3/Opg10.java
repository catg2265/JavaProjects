package Lecture3;

import java.util.Scanner;

public class Opg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] array = new String[10];
		System.out.print("GIve 2 seperate strings: ");
		
		for (int i = 0; i < 10; i++)
			array[i] = sc.next();
		String a = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (a.compareToIgnoreCase(array[i]) < 0)
				a = array[i];
		}
		
		System.out.println(a);
		
		sc.close();
	}

}
