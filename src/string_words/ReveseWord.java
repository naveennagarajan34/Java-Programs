package string_words;

public class ReveseWord {
	public static void main(String[] args) {
		String str = "I love Java";
		reverse_each_word_in_sentence(str);
		reverse_sentence(str);
	}

	public static void reverse_each_word_in_sentence(String str) {
		String[] words = str.split(" ");
		StringBuilder sb;
		String sentence = "";
		int spaceCount = words.length - 1, a = 0;
		for (String word : words) {
			sb = new StringBuilder(word).reverse();
			sentence += sb.toString();
			if (a < spaceCount) {
				sentence += " ";
				a++;
			}
		}
		System.out.println(sentence);
	}

	public static void reverse_sentence(String str) {
		String[] words = str.split(" ");
		String result = "";
		int spaceCount = words.length - 1, a = 0;
		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i];
			if (a < spaceCount) {
				result += " ";
				a++;
			}
		}
		System.out.println(result);
	}
}
