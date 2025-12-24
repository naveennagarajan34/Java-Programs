package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfEachChar {
	public static void main(String[] args) {
		String s = "banana";
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : s.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		// getOrDefault() method returns the value for the specified key if it is
		// present in the map (or)
		// returns the default value provided as the second argument if the key is not
		// found in the map.

		System.out.println(map);
	}
}
