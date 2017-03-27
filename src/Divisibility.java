import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Divisibility {

	public static boolean divisible(long n, long x) {
		if (n % x == 0)
			return true;
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		//System.setIn(new FileInputStream("input.txt"));
		
		Scanner sc = new Scanner(System.in);
		int t;
		long n, x, y;
		t = sc.nextInt();

		for (int j = 1; j <= t; j++) {
			n = sc.nextLong();
			x = sc.nextLong();
			y = sc.nextLong();
			for (int i = 2; i < n; i++) {
				if (divisible(i, x) && !divisible(i, y)) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}
}
