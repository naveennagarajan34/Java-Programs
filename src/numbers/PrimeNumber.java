package numbers;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find prime number or not... ");
		int n = sc.nextInt();
		sc.close();
		if (n <= 1) {
			System.out.println("The given number " + n + " is not a Prime number");
		} else if (n == 2 || n == 3) {
			System.out.println("The given number " + n + " is a Prime number");
		} else if (n % 2 == 0) {
			System.out.println("The given number " + n + " is not a Prime number");
		} else {
			boolean prime = true;
			for (int i = 3; i * i <= n; i += 2) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println("The given number " + n + " is a Prime number");
			} else {
				System.out.println("The given number " + n + " is not a Prime number");
			}
		}
	}
}
