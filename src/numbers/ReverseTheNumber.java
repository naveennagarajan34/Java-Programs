package numbers;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int N = 1387727;
		int output = 0;

		while (N != 0) {
			int rem = N % 10;
			output = output * 10 + rem;
			N/=10;
		}
		System.out.println(output);
	}

}
	