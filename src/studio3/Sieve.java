package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to go up to?");
		int n = in.nextInt();

		
		boolean[] array = new boolean[n+1];
			for (int i = 0; i < n+1 ; i++) {
				array[i] = true;
			for(int j = 2; j < n+1; j++) {
				if (i*j>0) {
				array[i] = false;
				}
		for (boolean value : array) {
		System.out.println(value);
	
			
					
	
			}	
		

	}

}

}
}