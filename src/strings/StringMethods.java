package strings;

public class StringMethods {

	public static void main(String[] args) {
		String input = "Sample String Input";
		charAtMethod(input);
		compareToMethod(input);
		concatMethod(input);
		containsMethod(input);
		matchesMethod(input);
	}

	public static void charAtMethod(String input) {
		int index = 3;
		System.out.println("The character at index-" + index + " is => " + input.charAt(index));
	}

	public static void compareToMethod(String input1) {
		String input2 = "Sample String Inputs";
		System.out.println(input1.compareTo(input2)); // Returns 0 when both strings are equal
	}

	public static void concatMethod(String input1) {
		String input2 = " concatenated";
		System.out.println("Concatenated string => " + input1.concat(input2));
	}

	public static void containsMethod(String input1) {
		String input2 = " String";
		System.out.println("Contains string => " + input1.contains(input2));
	}

	public static void matchesMethod(String input1) {
		System.out.println("Matches a string => " + input1.matches(".*[aeiou].*")); // returns true if string contains
																					// any of the vowels
	}
}
