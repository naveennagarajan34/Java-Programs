package strings;

public class AppendIndexUsingBuilder {

	public static void main(String[] args) {
		String str = "Selenium";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			builder.append(str.charAt(i)).append(i);
		}
		System.out.println(builder);
	}

}
