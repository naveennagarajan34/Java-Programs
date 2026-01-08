package string_words;

import java.util.LinkedHashSet;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		String str = "Hello world welcome to the world of Java";
		String[] words = str.split(" ");
		System.out.println("Number of words: " + words.length);

		Set<String> set = new LinkedHashSet<String>();
		for (String word : words) {
			set.add(word);
		}
		System.out.println("After removing Duplicate words: " + set);

	}

}
