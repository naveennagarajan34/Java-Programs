package strings;

public class CheckStringContainsOnlyNumbers {
	public static void main(String[] args) {
		String str = "135873";
		boolean flag = true;
		for (char ch : str.toCharArray()) {
			if (!Character.isDigit(ch)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Only Digits");
	}
}