package kitasoft;

public class practice407 {
	public static void main(String[] args) {
		int giants = 0;
		int tigers = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、巨人の得点は?");
			int score1 = new java.util.Scanner(System.in).nextInt();
			System.out.print(i + "回裏、阪神の特典は?");
			int score2 = new java.util.Scanner(System.in).nextInt();
			giants += score1;
			tigers += score2;
		}
		System.out.println("巨人:" + giants + "点、阪神:" + tigers + "点");
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if (tigers > giants) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}
}
