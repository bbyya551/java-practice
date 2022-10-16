package day4;

public class prob412 {
	public static void main(String[] args) {
		int min = 100;
		for (int i = 1; i <= 5; i++) {
			int num =  (int)(Math.random()*100)+1;
			System.out.println(num);
			if (num < min) {
				min = num;
			}
		}
		System.out.println("最小値:" + min);
	}
}
