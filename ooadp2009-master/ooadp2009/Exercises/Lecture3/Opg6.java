package Lecture3;

import java.util.Scanner;

public class Opg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("GIve 10 seperate integers");
		for (int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = array.length - 1; i >= 0; i--)
			System.out.println(array[i]);
		sc.close();
	}

}
