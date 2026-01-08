package strings;

public class RotationCheck {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "CDEAB";
		String temp = str1 + str1;
		if (temp.contains(str2))
			System.out.println("Rotation String");
		else
			System.out.println("Not a Rotation String");

		// rotate left cdeab
		int n = str1.length();
		int k = 2 % n;
		System.out.println(str1.substring(k) + str1.substring(0, k));

		// rotate right deabc
		System.out.println(str1.substring(n - k) + str1.substring(0, n - k));

	}

}
