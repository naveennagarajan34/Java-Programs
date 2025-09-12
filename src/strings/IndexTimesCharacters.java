package strings;

public class IndexTimesCharacters {

	public static void main(String[] args) {
		String str = "Selenium";
		transformString(str);
	}

	public static void transformString(String str) {
		for (int i = 0; i < str.length(); i++) {
			int loop = i + 1;
			System.out.print(str.charAt(i));
			while (loop > 0) {
				System.out.print("*");
				loop--;
			}
		}
	}

}
