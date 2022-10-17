package kitasoft;

public class practice418 {
	public static void main(String[] args) {
		int sum = 0;
		while (true) {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("合計は" + sum + "です");
	}
}
