package dk.aau.imi.med4.ooadp2009.javaintro;

/**
 * Looping constructs: while, for and do-while
 *
 */
public class JavaIntro05Loops {
	public static void main(String[] args) {

		System.out.println("First we count using while:");
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\nNow we count using for");
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		
		System.out.println("\nNow we count using do-while");
		int k = 0;
		//Do-while loop always executes at least once!
		do {
			System.out.println(k);
			k++;
		} while (k < 10);
		
		System.out.println("\nNow we count in twos");
		for(int j = 0; j < 20; j += 2) // "j += 2" means the same as "j = j + 2"
			System.out.println(j);
		
		System.out.println("\nNow we count down in twos");
		for(int j = 20; j >= 0; j -= 2) // "j -= 2" means the same as "j = j - 2"
			System.out.println(j);
		
		System.out.println("\nNow we have two variables changing value");
		for (int j = 0, x = 10; j < 10; j++, x--) {
			System.out.println("j = "+j+", x = "+ x);
		}
	}
}
