
public class prob302 {
	public static void main(String[] args) {
		int dice = (int)(Math.random()*10)+1;
		System.out.println(dice);
		if (dice != 1) {
			System.out.println("1ではありません");
		}
	}
}
