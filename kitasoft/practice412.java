package kitasoft;

public class practice412 {
	public static void main(String[] args) {
//		int sum = 0;
//		while(true) {
//			int num = new java.util.Scanner(System.in).nextInt();
//			sum += num;
//			if (sum > 100) {
//				break;
//			}
//		}
//		System.out.println("終了");
		
		int sum = 0;
		while(sum <= 100) {
			sum += new java.util.Scanner(System.in).nextInt();
		}
		System.out.println("合計は" + sum);
	}
}
