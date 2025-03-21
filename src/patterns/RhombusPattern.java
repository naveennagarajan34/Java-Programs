package patterns;

public class RhombusPattern {
	public static void main(String[] args) {
        System.out.println();
        int n=4;
        int fbound = 0;
        int sbound = n;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n+n;j++) {
                
                if(j<=n) {
                    if(j<n-fbound+1) {
                        System.out.print("* ");
                    } else {
                    System.out.print("  ");
                    }
                } else {
                    if(j>n+n-sbound && j>n) {
                        System.out.print("* ");
                } else if(j>n){
                    System.out.print("  ");
                    }
                }
        }
        sbound--;
        fbound++;
        System.out.println();
        }
    }
}
