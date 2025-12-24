package strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	public static void main(String[] args) {
		String s = "abcabcdbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		int left = 0, max = 0;

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);

			while (set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}

			set.add(ch);
			max = Math.max(max, right - left + 1);
		}

		return max;
	}
}
