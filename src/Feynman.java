import java.util.*;
import java.lang.*;

class Feynman {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			long sum = 0;
			for (int i = 1; i <= n; i++) {
				sum = sum + i*i;
			}
			System.out.println(sum);
			n = sc.nextInt();
		}
	}
}