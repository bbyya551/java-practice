
public class prob308 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("数値:" + num);
		if (num != 1) {
			System.out.println("1ではありません");
		} else if (num == 1) {
			System.out.println("1です");
		}
	}
}
