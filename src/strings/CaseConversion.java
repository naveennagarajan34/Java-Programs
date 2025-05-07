package strings;

public class CaseConversion {
	public static void main(String[] args) {
		String input = "aBc & ()DCs";
		char[] characters = input.toCharArray();
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < characters.length; i++) {
			if ((characters[i] >= 'A' && characters[i] <= 'Z') || (characters[i] >= 'a' && characters[i] <= 'z')) {
				if (characters[i] < 'a') {
					characters[i] = (char) (characters[i] + 32);
					build.append(characters[i]);
					continue;
				}
			}
			build.append(characters[i]);
		}
		System.out.println("The string is converted to LowerCase => "+build.toString());
	}
}
