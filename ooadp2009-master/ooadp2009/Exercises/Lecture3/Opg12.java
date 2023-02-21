package Lecture3;

import java.util.Arrays;
import java.util.Scanner;

public class Opg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] array = new String[10];
		
		System.out.print("Give me 10 doubles");
		
		for (int i = 0; i < array.length; i++)
			array[i] = sc.next();
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		sc.close();
	}

}
