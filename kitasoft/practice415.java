package kitasoft;

public class practice415 {
	public static void main(String[] args) {
		boolean judge = true;
		int num = new java.util.Scanner(System.in).nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				judge = false;
				break;
			}
		}
		if (judge) {
			System.out.println(num + "は素数です");
		} else {
			System.out.println(num + "は素数ではありません");
		}
	}
}
