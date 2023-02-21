package Lecture3;

import java.util.Scanner;

public class Opg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];
		System.out.print("Give 10 doubles: ");
		for (int i = 0; i < 10; i++)
			array[i] = sc.nextDouble();
		double a = array[0];
		for (int i = 0; i < 10; i++) {
			a += array[i];
		}
		a /= array.length;
		System.out.println(a+ " Is the mean");
		sc.close();
	}

}
