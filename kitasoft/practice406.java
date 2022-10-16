package kitasoft;

public class practice406 {
	public static void main(String[] args) {
		int wins = 0;
		for(int i = 0; i < 10; i++) {
			int result = new java.util.Scanner(System.in).nextInt();
			if (result == 1) {
				wins += 1;
			}	
		}
		System.out.println("勝ち" + wins + "回、負け" + (10-wins) + "回");
	}
}
