public class AtoI {

	public static int my_atoi(String s) {
		/*int x = 0, i = 0;
		while (s[i]) {
			x = s[i++] - 48 + x * 10;
		}*/
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		System.out.println(my_atoi("123"));
	}
}
