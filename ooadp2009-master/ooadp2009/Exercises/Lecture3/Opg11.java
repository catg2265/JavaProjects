package Lecture3;

import java.util.Scanner;
import java.util.Arrays;

public class Opg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] array = new double[10];
		
		System.out.print("Give me 10 doubles");
		
		for (int i = 0; i < array.length; i++)
			array[i] = sc.nextDouble();
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		sc.close();
	}
}
