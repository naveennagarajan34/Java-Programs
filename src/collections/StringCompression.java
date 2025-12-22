package collections;

public class StringCompression {

	public static void main(String[] args) {
		String str = "aaabbcaaa";
		StringBuilder sb = new StringBuilder();
		int count = 1;
//		System.out.println(str.length());
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else if (str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i)).append(count);
				count = 1;
			}

		}
		System.out.println(sb.toString());

	}

}
