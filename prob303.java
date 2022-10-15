
public class prob303 {
	public static void main(String[] args) {
		int dice = (int)(Math.random()*100)+1;
		if(dice < 50) {
			System.out.println("50未満です");
		}
	}
}
