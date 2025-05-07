package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String...");
		String input = sc.next();
		char[] characters = input.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = characters.length - 1; i >= 0; i--) {
			builder.append(characters[i]);
		}
		System.out.println("The reversed String is => " + builder.toString());
		sc.close();
	}
}
