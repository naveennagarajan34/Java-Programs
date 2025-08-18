package patterns;

public class RightTriangle {

	public static void main(String[] args) {
		int N = 5,a=0;

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N*2; j++) {
				if (j<=i || j>=N*2-a)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			a++;
			System.out.println();
		}

	}

}
