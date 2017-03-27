import java.util.Scanner;

public class NguyenTo {
	public static boolean nguyenTo(long n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test;
		long m, n;
		
		test = sc.nextInt();
		for (int i = 1; i <= test; i++) {	
			m = sc.nextLong();
			n = sc.nextLong();
			for (long j = m; j <= n; j++) {
				if (nguyenTo(j)) {
					System.out.println(j);
				}
			}
			System.out.println();
		}
	}
}
