package string_words;

public class StringSubsequence {
	public static void main(String[] args) {
		String str1 = "programming";
		String str2 = "ram";
		subsequence(str1, str2);
		substring(str1, str2);
	}

	public static void subsequence(String str1, String str2) {
		int i = 0, j = 0;
		for (; i < str1.length() && j < str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(j))
				j++;
		}
		if (j == str2.length())
			System.out.println("Subsequence");
	}

	public static void substring(String str1, String str2) {
		int i = 0, j = 0;
		while (i < str1.length() && j < str2.length()) {
			if (str1.charAt(i) == str2.charAt(j)) {
				j++;
			} else
				j = 0;
			i++;
		}
		if (j == str2.length())
			System.out.println("Substring");
	}
}
