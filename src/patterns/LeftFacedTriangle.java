package patterns;

import java.util.Scanner;

public class LeftFacedTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of columns...");
		int N = sc.nextInt();
		int var = N - 1;

		for (int i = 0; i < N - 1; i++) { // Loop for 1st half pattern
			for (int j = 0; j < N; j++) {
				if (j >= var) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
			var--;
		}
		
		int var2 = 0;
		for (int i = 0; i < N; i++) { // Loop for 2nd half pattern
			for (int j = 0; j < N; j++) {
				if (j >= var2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
			var2++;
		}
		sc.close();
	}

}
