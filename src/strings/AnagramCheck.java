package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class AnagramCheck {
	public static void main(String args[]) {
		String str = "silents";
		String str1 = "listens";
		anagramCheckUsingArray(str, str1);

		removeDuplicateCharacters();
	}

	public static void anagramCheckUsingArray(String str, String str1) {

		// First, if lengths differ → not anagram
		if (str.length() != str1.length()) {
			System.out.println("Not Anagram");
		} else {
			// Convert to char array
			char[] arr1 = str.toCharArray();
			char[] arr2 = str1.toCharArray();

			// Sort both arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// Compare
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}
	}

	public static void countOccurencesOfCharacter(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
	}

	public static void removeDuplicateCharacters() {
		String str = "naveen";
		String removedDuplicate = "";
		Set<Character> set = new LinkedHashSet<Character>();
		for (char ch : str.toCharArray()) {
			if (!set.contains(ch)) {
				set.add(ch);
				removedDuplicate += ch;
			}
		}
		System.out.println(removedDuplicate);
	}
}
