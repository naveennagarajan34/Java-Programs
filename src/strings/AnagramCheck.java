package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
	public static void main(String args[]) {
		String str = "silents";
		String str1 = "listens";
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		for (char ch : str1.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map1);
		System.out.println(map2);
		anagramCheckUsingArray(str, str1);
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
}
