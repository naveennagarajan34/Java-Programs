package strings;

public class PalinedromeTypeString {

	public static void main(String[] args) {
		String str = "radar";
//		int flag = 1;
		int len = str.length();

		String reverse = new StringBuilder(str).reverse().toString();
		StringBuilder sb = new StringBuilder();
		System.out.println(reverse);

		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
			temp = temp + str.charAt(i);
			sb.append(str.charAt(i));
		}

		if (str.equalsIgnoreCase(sb.toString()))
			System.out.println("Palinedrome...");
		else
			System.out.println("Not a Palinedrome");
	}
}
