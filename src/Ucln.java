public class Ucln {
	
	public static int ucln(int a, int b) {
		while (a != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println("Hungdh");
	}
}
