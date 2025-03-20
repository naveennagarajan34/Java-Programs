package problems;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		
		Pangram object = new Pangram();
		
		String input = "Mr JockTV quiz PhD bags few lynx";
		boolean pangram = false, perfectPangram = false;
		
		perfectPangram = object.checkPerfectPangram(input.replaceAll("\\s", "").toLowerCase());
		pangram = object.checkPangram(input.replaceAll("\\s", "").toLowerCase());
		
		if (perfectPangram) System.out.println("The given string is Perfect Pangram");
		else if (pangram) System.out.println("The given string is Pangram");
		else System.out.println("The given string is not a pangram");
	}

	public boolean checkPangram(String input) {
		boolean pangram = true;
		int[] array = new int[27];
		Arrays.fill(array, 0);
		for (int i = 0; i < input.length(); i++) {
			int index = (int) (input.charAt(i)) - 96;
			array[index]++;
		}
		for (int i = 1; i <= 26; i++) {
			if (array[i] == 0) {
				pangram = false;
				break;
			}
		}
		return pangram;
	}
	
	public boolean checkPerfectPangram(String input) {
		int[] array = new int[27];
		Arrays.fill(array, 0);
		for (int i = 0; i < input.length(); i++) {
			int index = (int) (input.charAt(i)) - 96;
			array[index]++;
		}
		for (int i = 1; i <= 26; i++) {
			if (array[i] < 1 || array[i] > 1) {
				return false;
			}
		}
		return true;
	}
}
