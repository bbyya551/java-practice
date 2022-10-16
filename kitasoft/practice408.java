package kitasoft;

public class practice408 {
	public static void main(String[] args) {
		int max = 0;
		for (int i = 1; i <= 10; i++) {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);
	}
}
