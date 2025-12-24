package strings;

public class RotationCheck {

	public static void main(String[] args) {
		String str1 = "ABCDE";
		String str2 = "CDEAB";
		String temp = str1 + str1;
		if (temp.contains(str2))
			System.out.println("Rotation String");
		else
			System.out.println("Not a Rotation String");

	}

}
