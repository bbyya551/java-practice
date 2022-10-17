package kitasoft;

public class practice413 {
	public static void main(String[] args) {
		int strike = 0;
		int ball = 0;
		while ((strike < 3) && (ball < 4)) {
			System.out.println("ストライク=1 or ボール=2 or ファウル=3 ?");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 1) {
				strike += 1;
			} else if (num == 2) {
				ball += 1;
			} else if (num == 3 && strike < 2) {
				strike += 1;
			}
		}
		System.out.println(ball + "ボール, " + strike + "ストライク");
	}
}
