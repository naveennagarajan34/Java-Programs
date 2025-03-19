package patterns;

public class NumberPattern1 {

	public static void main(String[] args) {
		
//        		1   2   3   4   
//    		8   7   6   5   
//		9   10   11   12   
//16   15   14   13   
		
		int n = 4;
		int num = n, jnum = 0;

		int val = 1;
		for (int i = 1; i <= n; i++, num--, jnum++) {
			for (int j = 1; j < n * 2 - jnum; j++) {
				if (j >= num) {
					if (i % 2 == 1)
						System.out.printf("%d   ", val++);
					else
						System.out.printf("%d   ", val--);
				} else {
					System.out.print("  "
							+ "  ");
				}
			}
			if (i % 2 == 1)
				val = val + n - 1;
			else
				val = val + n + 1;
			System.out.println();
		}
	}
}
