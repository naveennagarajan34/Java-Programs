package strings;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String s = "swiss";
		for (char ch : s.toCharArray()) {
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				// First and last index are same, so character is non-repeated
				System.out.println(ch);
				break;
			}
		}
	}
}
