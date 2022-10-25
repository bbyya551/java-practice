package kitasoftver2;

public class practice419 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		while(true) {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 0) {
				break;
			}
			sum += num;
			count++;
		}
		System.out.println("平均は" + (sum / count));
	}
}
