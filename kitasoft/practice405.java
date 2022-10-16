package kitasoft;

public class practice405 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			int value = new java.util.Scanner(System.in).nextInt();
			sum += value;
		}
		System.out.println("平均は" + (sum / 10));
	}
}
