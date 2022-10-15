
public class prob310 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		if(num <= 10 || num >= 90) {
			System.out.println("10以下か、90以上の値です");
		} else {
			System.out.println("10より大きく90未満です");
		}
	}
}
