package day4ver2;

public class prob402 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("数: " + num);
		int i = 1;
		while (i <= num) {
			System.out.print("■" + " ");
			i++;
		}
	}
}
