package kitasoft;

public class practice409 {
	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < 10; i++) {
			int value = new java.util.Scanner(System.in).nextInt();
			if (i == 0) {
				max = value;
				min = value;
			} else {
				if (value > max) {
					max = value;
				} else if (value < min) {
					min = value;
				}
			}
		}
		System.out.println("最大値=" + max + "最小値=" + min);
	}
}
