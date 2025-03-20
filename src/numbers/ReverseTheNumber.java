package numbers;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int N = 1327;
		int reversed = 0;
		while(N>0) {
			reversed = reversed * 10 + (N%10);
			N/=10;
		}
		System.out.println(reversed);

	}

}
